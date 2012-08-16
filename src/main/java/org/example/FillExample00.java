package org.example;

import org.riversun.image_grabber.ImageGrabber;

/**
 * 
 * Fill Exmaple 00<br>
 * - Fill canvas with color
 */
public class FillExample00 {

    public static void main(String[] args) {

        // create 400x400 image grabber as canvas
        ImageGrabber igCanvas = new ImageGrabber(400, 400);

        // fill with blue
        igCanvas.fill(0xff0000ff);

        // show preview window
        igCanvas.showPreviewWindow("");
    }
}
