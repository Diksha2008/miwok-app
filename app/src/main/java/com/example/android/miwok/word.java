package com.example.android.miwok;

/**
 * {@link word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class word {
    /** Default translation for the word */
    private String mMiwokWord;

    /** Miwok translation for the word */
    private String mDefaultWord;

    /** Image Id **/
    private int mImageResourceId=NO_IMAGE_PROVIDED;

    /**Audio ID **/
    private int mAudioResourecId;

    /**to define visibilty**/
    private static final int NO_IMAGE_PROVIDED=-1;


    public word(String defaultWord,String miwokWord,int AudioResourceId){
        mDefaultWord=defaultWord;
        mMiwokWord=miwokWord;
        mAudioResourecId=AudioResourceId;
    }

    public word(String defaultWord,String miwokWord,int ImageResourceId,int AudioResourceId){
        mDefaultWord=defaultWord;
        mMiwokWord=miwokWord;
        mImageResourceId=ImageResourceId;
        mAudioResourecId=AudioResourceId;
    }

    /**
     *Get miwok translation
     */
    public String getMiwokTranslation(){
        return mMiwokWord;
    }

    /**
     *Get deafault translation
     */
    public String getDefaultTranslation(){
        return mDefaultWord;
    }

    /**
     *Get Image Resource ID
     */
    public int getImageResourceID(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourecIdID(){
        return mAudioResourecId;
    }
}
