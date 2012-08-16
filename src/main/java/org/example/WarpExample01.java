package org.example;

import java.awt.Point;

import org.riversun.image_grabber.ImageGrabber;

/**
 * 
 * Warp example 01
 *
 * - Synthesize the image of background and thewarped image of foreground
 */
public class WarpExample01 {

    public static void main(String[] args) {

        ImageGrabber foregroundImage = new ImageGrabber("img_warp_example_foreground.png");
        ImageGrabber backgroundImage = new ImageGrabber("img_warp_example_bagkcgound.png");

        // Left-Top coordinate of the Vertex to be warped
        Point p0 = new Point(350, 197);

        // Right-Top coordinate of the Vertex to be warped
        Point p1 = new Point(617, 95);

        // Right-Bottom coordinate of the Vertex to be warped
        Point p2 = new Point(859, 543);

        // Left-Bottom coordinate of the Vertex to be warped
        Point p3 = new Point(580, 668);

        foregroundImage.warp(p0, p1, p2, p3);

        // synthesize
        backgroundImage.put(foregroundImage);

        // show result image on the preview window
        backgroundImage.showPreviewWindow();

    }

}
