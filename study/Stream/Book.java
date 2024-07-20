package Stream;

/*@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode//用于后期的去重使用*/
public class Book {
    //id
    private Long id;
    //书名
    private String name;
    //分类
    private String category;

    //评分
    private Integer score;

    //简介
    private String intro;

    public Book() {
    }

    public Book(Long id, String name, String category, Integer score, String intro) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.score = score;
        this.intro = intro;
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
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
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

    public String toString() {
        return "Book{id = " + id + ", name = " + name + ", category = " + category + ", score = " + score + ", intro = " + intro + "}";
    }

}