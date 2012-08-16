package org.example;

import java.awt.Point;

import org.riversun.image_grabber.ImageGrabber;
import org.riversun.image_grabber.ImageGrabber.EWarpPolicy;

/**
 * 
 * Warp example 01 <br>
 * <br>
 * Rectangle image to Warped image conversion<br>
 * <br>
 * Specify four corners of the coordinates in the rectangle for the warp
 * destination
 */
public class WarpExample00 {

    public static void main(String[] args) {

        ImageGrabber foregroundImage = new ImageGrabber("img_warp_example_foreground.png");

        // show source image on the preview window
        foregroundImage.showPreviewWindow("Before (Source image)", 0.5f);

        // Specify four corners of the coordinates in the rectangle for the warp
        // destination

        // Left-Top coordinate of the Vertex to be warped
        Point p0 = new Point(350, 197);

        // Right-Top coordinate of the Vertex to be warped
        Point p1 = new Point(617, 95);

        // Right-Bottom coordinate of the Vertex to be warped
        Point p2 = new Point(859, 543);

        // Left-Bottom coordinate of the Vertex to be warped
        Point p3 = new Point(580, 668);

        // Execute 'WARP'
        foregroundImage.warp(p0, p1, p2, p3, EWarpPolicy.RESIZE_AND_FIT, null);

        // show warped image on the window
        foregroundImage.showPreviewWindow("After (Warped image)");

    }

}
