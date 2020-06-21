package com.example.firstjsontest;

public class ExampleItem {

    private String mImageUrl;
    private String mCreator;
    private String mCategory;
    private String mInstructions;
    private String mIngredient1;
    private String mIngredient2;
    private String mIngredient3;
    private String mIngredient4;
    private String mIngredient5;
    private String mIngredient6;
    private String mMeasure1;
    private String mMeasure2;
    private String mMeasure3;
    private String mMeasure4;
    private String mMeasure5;
    private String mMeasure6;





    public String getmMeasure1() {
        return mMeasure1;
    }

    public String getmMeasure2() {
        return mMeasure2;
    }

    public String getmMeasure3() {
        return mMeasure3;
    }

    public String getmMeasure4() {
        return mMeasure4;
    }

    public String getmMeasure5() {
        return mMeasure5;
    }

    public String getmMeasure6() {
        return mMeasure6;
    }


    public String getmIngredient1() {
        return mIngredient1;
    }

    public String getmIngredient2() {
        return mIngredient2;
    }

    public String getmIngredient3() {
        return mIngredient3;
    }

    public String getmIngredient4() {
        return mIngredient4;
    }

    public String getmIngredient5() {
        return mIngredient5;
    }

    public String getmIngredient6() {
        return mIngredient6;
    }


    public String getmImageUrl() {

        return mImageUrl;
    }

    public String getCreator(){
        return mCreator;
    }

    public String getCategoryCount(){
        return mCategory;
    }

    public String getInstructions(){

        return mInstructions;
    }


    // Creating constructor using our data

    public ExampleItem(String imageUrl, String creator, String categoryName, String instructions, String ingredient1, String ingredient2, String ingredient3, String ingredient4, String ingredient5, String ingredient6, String measure1, String measure2, String measure3, String measure4, String measure5, String measure6) {
        mImageUrl = imageUrl;
        mCreator = creator;
        mCategory = categoryName;
        mInstructions = instructions;
        mIngredient1 = ingredient1;
        mIngredient2 = ingredient2;
        mIngredient3 = ingredient3;
        mIngredient4 = ingredient4;
        mIngredient5 = ingredient5;
        mIngredient6 = ingredient6;
        mMeasure1 = measure1;
        mMeasure2 = measure2;
        mMeasure3 = measure3;
        mMeasure4 = measure4;
        mMeasure5 = measure5;
        mMeasure6 = measure6;
    }

}
