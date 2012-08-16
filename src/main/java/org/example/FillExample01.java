package org.example;

import org.riversun.image_grabber.ImageGrabber;

/**
 * 
 * Fill Exmaple 01<br>
 * - Fill with image as tiling pattern
 */
public class FillExample01 {

	public static void main(String[] args) {

		// create 400x400 image grabber as canvas
		ImageGrabber igCanvas = new ImageGrabber(400, 400);

		// create image grabber as object to put in
		ImageGrabber igObject = new ImageGrabber("img_put_example_panel_240x320.png").scale(0.25d, 0.25d);

		// fill as 'tiling'
		igCanvas.fill(igObject);

		// show preview window
		igCanvas.showPreviewWindow("Tiling");
	}
}
