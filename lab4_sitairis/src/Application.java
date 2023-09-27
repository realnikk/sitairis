class Application {
    private String id;
    private String name;
    private String company;
    private String releaseDate;
    private String lastUpdate;
    private String ageLimit;
    private Double price;
    private Integer reviews;
    private Double rating;
    private String description;

    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public String getAgeLimit() {
        return ageLimit;
    }
    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getReviews() {
        return reviews;
    }
    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getInfo() {
        return "Application Info...\n" +
                "App ID " + id + '\n' +
                "App name: " + name + '\n' +
                "Company-developer: " + company + '\n' +
                "Release date: " + releaseDate + '\n' +
                "Last update: " + lastUpdate + '\n' +
                "Age limit: " + ageLimit + '\n' +
                "Price of premium version: " + price + '\n' +
                "Num of reviews: " + reviews + '\n' +
                "Rating on a 5-point scale: " + rating + '\n' +
                "Description:" + '\n' + description + '\n' +
                "__________________________________________________________";
    }
}