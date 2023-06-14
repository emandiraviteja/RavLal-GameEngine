package com.ravlal.ravlal_gameengine.util.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * Created by Raviteja Emandi on 14,June,2023
 */

public class ClipUtils {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    private ClipUtils() {
    }
    //========================================================

    //--------------------------------------------------------
    // Static methods
    //--------------------------------------------------------
    public static Bitmap[] clipBitmapLeftRight(Bitmap src, int size) {
        Bitmap[] bitmaps = new Bitmap[size];
        int width = src.getWidth();
        int height = src.getHeight();

        // Clip bitmap by size
        for (int i = 0; i < size; i++) {
            // Create an empty bitmap and canvas
            Bitmap bitmap = BitmapUtils.createBitmap(width, height);
            Canvas canvas = new Canvas(bitmap);

            // Clip bitmap progressively from left to right
            int clipWidth = width * (i + 1) / size;
            Bitmap clipBitmap = Bitmap.createBitmap(src, 0, 0, clipWidth, height);

            // Draw clipped bitmap on canvas
            canvas.drawBitmap(clipBitmap, null, new Rect(0, 0, clipWidth, height), null);
            bitmaps[i] = bitmap;
        }

        return bitmaps;
    }

    public static Bitmap[] clipBitmapTopDown(Bitmap src, int size) {
        Bitmap[] bitmaps = new Bitmap[size];
        int width = src.getWidth();
        int height = src.getHeight();

        // Clip bitmap by size
        for (int i = 0; i < size; i++) {
            // Create an empty bitmap and canvas
            Bitmap bitmap = BitmapUtils.createBitmap(width, height);
            Canvas canvas = new Canvas(bitmap);

            // Clip bitmap progressively from top to down
            int clipHeight = height * (i + 1) / size;
            Bitmap clipBitmap = Bitmap.createBitmap(src, 0, 0, width, clipHeight);

            // Draw clipped bitmap on canvas
            canvas.drawBitmap(clipBitmap, null, new Rect(0, 0, width, clipHeight), null);
            bitmaps[i] = bitmap;
        }

        return bitmaps;
    }

    public static Bitmap[] clipBitmapInOut(Bitmap src, int size) {
        Bitmap[] bitmaps = new Bitmap[size];
        int width = src.getWidth();
        int height = src.getHeight();

        // Clip bitmap by size
        for (int i = 0; i < size; i++) {
            // Create an empty bitmap and canvas
            Bitmap bitmap = BitmapUtils.createBitmap(width, height);
            Canvas canvas = new Canvas(bitmap);

            // Clip bitmap progressively from inner to outer
            int clipWidth = width * (i + 1) / size;
            int clipHeight = height * (i + 1) / size;
            int startX = (width - clipWidth) / 2;
            int startY = (height - clipHeight) / 2;
            Bitmap clipBitmap = Bitmap.createBitmap(src, startX, startY, clipWidth, clipHeight);

            // Draw clipped bitmap on canvas
            canvas.drawBitmap(clipBitmap, null, new Rect(startX, startY,
                    startX + clipWidth, startY + clipHeight), null);
            bitmaps[i] = bitmap;
        }

        return bitmaps;
    }
    //========================================================

}
