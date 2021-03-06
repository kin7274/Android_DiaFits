package com.dreamwalker.supercalendar.interf;

import android.graphics.Canvas;

import com.dreamwalker.supercalendar.view.Day;


/**
 * Created by ldf on 17/6/26.
 */

public interface IDayRenderer {

    void refreshContent();

    void drawDay(Canvas canvas, Day day);

    IDayRenderer copy();

}
