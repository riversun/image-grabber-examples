package org.example;

import org.riversun.image_grabber.ImageGrabber;

/**
 * 
 * Put Exmaple 00<br>
 * - Put the imageGrabber object on the imageGrabber object
 */
public class PutExample00 {

    public static void main(String[] args) {

        // create image grabber as canvas
        ImageGrabber igCanvas = new ImageGrabber(400, 400);

        // fill with black
        igCanvas.fill(0xff000000);

        // create image grabber as object to put in
        ImageGrabber igObject = new ImageGrabber("img_put_example_panel_240x320.png");

        // scale image
        final double scaleRatioOfWidth = 0.5d;
        final double scaleRatioOfHeight = 0.5d;
        igObject.scale(scaleRatioOfWidth, scaleRatioOfHeight);

        // put the object on the canvas
        igCanvas.put(igObject);

        // show preview window
        igCanvas.showPreviewWindow("Default");

        // put the object in the center of the canvas
        igCanvas.clear().fill(0xff000000).putInCenter(igObject);

        // show preview window
        igCanvas.showPreviewWindow("Center");

        // put the object at the specified location
        final int left = 50;
        final int top = 100;
        igCanvas.clear().fill(0xff000000).put(igObject, left, top);

        // show preview window
        igCanvas.showPreviewWindow("Specified left=" + left + " top=" + top);
    }
}
