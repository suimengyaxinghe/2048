package Stream;

import java.util.List;
import java.util.Objects;

/*@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode//用于后期的去重使用*/
public class Author {
    //id
    private Long id;
    //姓名
    private String name;
    //年龄
    private Integer age;
    //简介
    private String intro;
    //作品
    private List<Book> books;

    public Author() {
    }

    public Author(Long id, String name, Integer age, String intro, List<Book> books) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.intro = intro;
        this.books = books;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return intro
     */
    public String getIntro() {
        return intro;
    }

    /**
     * 设置
     * @param intro
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * 获取
     * @return books
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * 设置
     * @param books
     */
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String toString() {
        return "Author{id = " + id + ", name = " + name + ", age = " + age + ", intro = " + intro + ", books = " + books + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age &&
                Objects.equals(id, author.id) &&
                Objects.equals(name, author.name) &&
                Objects.equals(intro, author.intro)&&
                Objects.equals(books, author.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, intro,books);
    }
}