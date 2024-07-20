package Stream;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        //要求1：打印所有年龄小于18的作家的名字，并且要注意去重
        List<Author> authors = getAuthors();//获得数据
        authors.stream()//把集合转换成流
                .distinct()//先去除重复的作家
                .filter(author -> author.getAge() < 18)//筛选年龄小于18的
                .forEach(author -> System.out.println(author.getName()));//遍历打印名字
        System.out.println("------------------");
        //(filter)：打印所有姓名长度大于1的作家的姓名
        authors.stream()
                .filter(author -> author.getName().length() > 1)
                .forEach(author -> System.out.println(author.getName()));
        System.out.println("------------------");
        //(map):打印所有作家的名称
        authors.stream()
                .map(author -> author.getName())
                .forEach(s -> System.out.println(s));
        System.out.println("------------------");
        //（distinct）打印所有作家的姓名，并且要求其中不能有重复元素。
        authors.stream()
                .distinct()
                .forEach(author -> System.out.println(author.getName()));
        System.out.println("------------------");
        //（sorted）对流中的元素按照年龄进行降序排序，并且要求不能有重复的元素。
        authors.stream()
                .distinct()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .forEach(author -> System.out.println(author.getAge()));
        System.out.println("------------------");
        authors.stream()
                .distinct()
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(author -> System.out.println(author.getAge()));
        System.out.println("------------------");
        //(limit)对流中的元素按照年龄进行降序排序，并且要求不能有重复的元素,然后打印其中年龄最大的两个作家的姓名。
        authors.stream()
                .distinct()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .limit(2)
                .forEach(author -> System.out.println(author.getName()));
        System.out.println("------------------");
        //(flatMap)打印所有书籍的名字。要求对重复的元素进行去重。
        authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .forEach(book -> System.out.println(book.getName()));
        System.out.println("------------------");
        //(flatMap)打印现有数据的所有分类。要求对分类进行去重。不能出现这种格式：哲学,爱情
        authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .flatMap(book -> Arrays.stream(book.getCategory().split(",")))
                .distinct()
                .forEach(category -> System.out.println(category));
        System.out.println("------------------");
        //(count)打印这些作家的所出书籍的数目，注意删除重复元素。
        long count = authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .count();
        System.out.println(count);
        System.out.println("------------------");
        //(max&min)分别获取这些作家的所出书籍的最高分和最低分并打印
        Optional<Integer> max = authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .map(book -> book.getScore())
                .max((o1, o2) -> o1 - o2);
        System.out.println(max.get());
        Optional<Integer> min = authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .map(book -> book.getScore())
                .min((o1, o2) -> o1 - o2);
        System.out.println(min.get());
        System.out.println("------------------");
        //(collect)把当前流转换成一个集合。
        List<String> collect = authors.stream()
                .map(author -> author.getName())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("------------------");
        //获取一个所有书名的Set集合。
        Set<String> booknamecollect = authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .map(book -> book.getName())
                .collect(Collectors.toSet());
        System.out.println(booknamecollect);
        System.out.println("------------------");
        //获取一个Map集合，map的key为作者名，value为List<Book>
        Map<String, List<Book>> map = authors.stream()
                .distinct()
                .collect(Collectors.toMap(author -> author.getName(), author -> author.getBooks()));
        System.out.println(map);
        System.out.println("------------------");
        ;
        //(anymatch)判断是否有年龄在29以上的作家
        boolean flag1 = authors.stream()
                .anyMatch(author -> author.getAge() > 29);
        System.out.println(flag1);
        System.out.println("------------------");
        //(allmatch)判断是否所有的作家都是成年人
        boolean flag2 = authors.stream()
                .allMatch(author -> author.getAge() >= 18);
        System.out.println(flag2);
        System.out.println("------------------");
        //(nonematch)判断作家是否都没有超过100岁的。
        boolean flag3 = authors.stream()
                .noneMatch(new Predicate<Author>() {
                    @Override
                    public boolean test(Author author) {
                        return author.getAge() > 100;
                    }
                });
        System.out.println(flag3);
        System.out.println("------------------");
        //(findany)获取任意一个年龄大于18的作家，如果存在就输出他的名字
        Optional<Author> optionalAuthor = authors.stream()
                .filter(author -> author.getAge() > 18)
                .findAny();
        optionalAuthor.ifPresent(author -> System.out.println(author.getName()));
        System.out.println("------------------");
        //(fingfirst)获取一个年龄最小的作家，并输出他的姓名。
        Optional<Author> optionalAuthor1 = authors.stream()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .findFirst();
        optionalAuthor1.ifPresent(author -> System.out.println(author.getName()));
        System.out.println("------------------");
        //(reduce)使用reduce求所有作者年龄的和
        Integer sum = authors.stream()
                .map(author -> author.getAge())
                .distinct()
                .reduce(0, (result, element) -> result + element);
        System.out.println(sum);
        System.out.println("------------------");
        //使用reduce求所有作者中年龄的最大值
        Integer maxage = authors.stream()
                .map(author -> author.getAge())
                .distinct()
                .reduce(0, (integer, integer2) -> integer > integer2 ? integer : integer2);
        System.out.println(maxage);
        System.out.println("------------------");
        //使用reduce求所有作者中年龄的最小值
        Optional<Integer> minage = authors.stream()
                .map(author -> author.getAge())
                .distinct()
                .reduce((integer, integer2) -> integer < integer2 ? integer : integer2);
        minage.ifPresent(integer -> System.out.println(minage.get()));
        System.out.println("------------------");
        Optional<Author> authorsOptional = getAuthorsOptional();
        System.out.println(authorsOptional);
    }

    ;

    private static List<Author> getAuthors() {
        //数据初始化
        Author author = new Author(1L, "蒙多", 33, "一个从菜刀中明悟哲理的祖安人", null);
        Author author2 = new Author(2L, "亚拉索", 15, "狂风也追逐不上他的思考速度", null);
        Author author3 = new Author(3L, "易", 14, "是这个世界在限制他的思维", null);
        Author author4 = new Author(3L, "易", 14, "是这个世界在限制他的思维", null);

        //书籍列表
        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        books1.add(new Book(1L, "刀的两侧是光明与黑暗", "哲学,爱情", 88, "用一把刀划分了爱恨"));
        books1.add(new Book(2L, "一个人不能死在同一把刀下", "个人成长,爱情", 99, "讲述如何从失败中明悟真理"));

        books2.add(new Book(3L, "那风吹不到的地方", "哲学", 85, "带你用思维去领略世界的尽头"));
        books2.add(new Book(3L, "那风吹不到的地方", "哲学", 85, "带你用思维去领略世界的尽头"));
        books2.add(new Book(4L, "吹或不吹", "爱情,个人传记", 56, "一个哲学家的恋爱观注定很难把他所在的时代理解"));

        books3.add(new Book(5L, "你的剑就是我的剑", "爱情", 56, "无法想象一个武者能对他的伴侣这么的宽容"));
        books3.add(new Book(6L, "风与剑", "个人传记", 100, "两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));
        books3.add(new Book(6L, "风与剑", "个人传记", 100, "两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));

        author.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books3);

        List<Author> authorList = new ArrayList<>(Arrays.asList(author, author2, author3, author4));
        return authorList;
    }
    public  static Optional<Author> getAuthorsOptional(){
        //数据初始化
        Author author = new Author(1L, "蒙多", 33, "一个从菜刀中明悟哲理的祖安人", null);
        Author author2 = new Author(2L, "亚拉索", 15, "狂风也追逐不上他的思考速度", null);
        Author author3 = new Author(3L, "易", 14, "是这个世界在限制他的思维", null);
        Author author4 = new Author(3L, "易", 14, "是这个世界在限制他的思维", null);

        //书籍列表
        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        books1.add(new Book(1L, "刀的两侧是光明与黑暗", "哲学,爱情", 88, "用一把刀划分了爱恨"));
        books1.add(new Book(2L, "一个人不能死在同一把刀下", "个人成长,爱情", 99, "讲述如何从失败中明悟真理"));

        books2.add(new Book(3L, "那风吹不到的地方", "哲学", 85, "带你用思维去领略世界的尽头"));
        books2.add(new Book(3L, "那风吹不到的地方", "哲学", 85, "带你用思维去领略世界的尽头"));
        books2.add(new Book(4L, "吹或不吹", "爱情,个人传记", 56, "一个哲学家的恋爱观注定很难把他所在的时代理解"));

        books3.add(new Book(5L, "你的剑就是我的剑", "爱情", 56, "无法想象一个武者能对他的伴侣这么的宽容"));
        books3.add(new Book(6L, "风与剑", "个人传记", 100, "两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));
        books3.add(new Book(6L, "风与剑", "个人传记", 100, "两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));

        author.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books3);
        return Optional.ofNullable(author);
    }
}
