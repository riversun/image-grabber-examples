package org.example;

import java.awt.Point;

import org.riversun.image_grabber.ImageGrabber;

/**
 * 
 * Warp example 02<br>
 * - Warp from Quadrilateral to rectangle
 */
public class WarpExample02 {

    public static void main(String[] args) {

        ImageGrabber igSrc = new ImageGrabber("img_warp_example_photo1.png");

        final float previewWindowScaleRatio = 0.5f;

        igSrc.showPreviewWindow("Before (source)", previewWindowScaleRatio);

        // Crop quadrilateral area from source image
        Point p0 = new Point(651, 157);
        Point p1 = new Point(1059, 335);
        Point p2 = new Point(642, 719);
        Point p3 = new Point(225, 514);

        int destRectWidth = 320;
        int destRectHeight = 480;

        // Warp from Quadrilateral to rectangle
        igSrc.cropWarp(p0, p1, p2, p3, destRectWidth, destRectHeight);

        igSrc.showPreviewWindow("After (image cropped and warped as rect");

    }

}
