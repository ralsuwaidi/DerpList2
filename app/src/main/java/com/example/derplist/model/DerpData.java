package com.example.derplist.model;

import com.example.derplist.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rashid on 24/09/2016.
 */

public class DerpData {
    private static final String[] titles = {"Nothingness cannot be defined",
            "Time is like a river made up of the events which happen, and a violent stream; " +
                    "for as soon as a thing has been seen, it is carried away, and another comes" +
                    " in its place, and this will be carried away too,",
            "But when I know that the glass is already broken, every minute with it is precious.",
            "For me, it is far better to grasp the Universe as it really is than to persist in" +
                    " delusion, however satisfying and reassuring.",
            "The seeker after the truth is not one who studies the writings of the ancients and," +
                    " following his natural disposition, puts his trust in them, but rather the" +
                    " one who suspects his faith in them and questions what he gathers from them," +
                    " the one who submits to argument and demonstration, and not to the " +
                    "sayings of a human being whose nature is fraught with all kinds " +
                    "of imperfection and deficiency." +
                    "The seeker after the truth is not one who studies the writings of the ancients and," +
                    " following his natural disposition, puts his trust in them, but rather the" +
                    " one who suspects his faith in them and questions what he gathers from them," +
                    " the one who submits to argument and demonstration, and not to the " +
                    "sayings of a human being whose nature is fraught with all kinds " +
                    "of imperfection and deficiency.",
            "You must take personal responsibility. You cannot change the circumstances, the" +
                    " seasons, or the wind, but you can change yourself. That is something you" +
                    " have charge of.","Description here","Description here","Description here",
            "Description here","Description here","Description here",
            "Description here","Description here","Description here",
            "Description here","Description here","Description here",
            "Description here","Description here","Description here",
            "Description here","Description here","Description here",
            "Description here","Description here","Description here","Description here",
            "Description here",

    };
    private static final String[] subTitles = {"Prophet Adam",
            "Prophet Idris (Enoch)",
            "Prophet Noah (Noah)",
            "Prophet Hud",
            "Prophet Salih",
            "Prophet Ibrahim (Abraham)",
            "Prophet Isma'il (Ishmael)","Ishaq (Isaac)","Prophet Yaqub (Jacob)","Prophet Lot","Prophet Shuaib",
            "Prophet Yusuf (Joseph)","Prophet Ayoub (Job)", "Prophet (Dhul-Kifl)", "Prophet Yunus (Jonah)",
            "Prophet Musa (Moses) & Prophet Harun", "Prophet Hizqeel (Ezekiel)", "Prophet Elyas (Elisha)",
            "Prophet Shammil (Samuel)", "Prophet Dawud (David)", "Prophet Sulaiman (Soloman)",
            "Prophet Shia (Isaiah)", "Prophet Aramaya (Jeremiah)", "Prophet Daniel",
            "Prophet Uzair (Ezra)", "Prophet Zakariyah (Zechariah)", "Prophet Yahya (John)",
            "Prophet Isa (Jesus)", "Prophet Muhammad "


    };
    private static final int icon = R.drawable.ic_tonality_black_36dp;

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        //Repeat process 4 times, so that we have enough data to demonstrate a scrollable
        //RecyclerView
        for (int x = 0; x < 1; x++) {
            //create ListItem with dummy data, then add them to our List
            for (int i = 0; i < titles.length; i++) {
                ListItem item = new ListItem();
                item.setTitle(titles[i]);
                item.setSubTitle(subTitles[i]);
                data.add(item);
            }
        }
        return data;
    }
}
