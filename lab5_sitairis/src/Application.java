public abstract class Application {
    PremiumStrategy strategy;
    protected String id;
    protected String name;
    protected String company;
    protected String category;
    protected String releaseDate;
    protected String lastUpdate;
    protected String ageLimit;
    protected Integer reviews;
    protected Double rating;
    protected String description;

    public Application(String id, String name, String company, String category, String releaseDate, String lastUpdate, String ageLimit, Integer reviews, Double rating, String description){
        this.id = id;
        this.name = name;
        this.company = company;
        this.category = category;
        this.releaseDate = releaseDate;
        this.lastUpdate = lastUpdate;
        this.ageLimit = ageLimit;
        this.reviews = reviews;
        this.rating = rating;
        this.description = description;
    }

    public abstract void start();

    public void exit() {
        System.out.println("Завершение работы приложения " + name);
    }
    public String setPremiumVersionPrice() {
        return strategy.setPremiumVersionPrice();
    }

    //public void releasePremiumVersion(PremiumVersionStrategy strategy) {
      //  strategy.sellPremiumVersion();
    //}

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
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
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
    //public Double getPrice() {
        //return price;
    //}
    //public void setPrice(Double price) {
     //   this.price = price;
    //}
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
                "Category: " + category + '\n' +
                "Release date: " + releaseDate + '\n' +
                "Last update: " + lastUpdate + '\n' +
                "Age limit: " + ageLimit + '\n' +
                //"Price of premium version: " + price + '\n' +
                "Num of reviews: " + reviews + '\n' +
                "Rating on a 5-point scale: " + rating + '\n' +
                "Description:" + '\n' + description + '\n' +
                "__________________________________________________________";
    }
}
