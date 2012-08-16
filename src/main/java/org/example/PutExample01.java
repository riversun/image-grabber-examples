package org.example;

import org.riversun.image_grabber.ImageGrabber;
import org.riversun.image_grabber.ImageGrabber.GridPosition;

/**
 * 
 * Put Exmaple 01<br>
 * -Put images arranged in a grid
 *
 */
public class PutExample01 {

    public static void main(String[] args) {

        // create image grabber as canvas
        ImageGrabber igCanvas = new ImageGrabber(400, 400);

        // fill black
        igCanvas.fill(0xff000000);

        // create image grabber as object to put in
        ImageGrabber igObject = new ImageGrabber("img_put_example_panel_240x320.png").scale(0.5d, 0.5d);

        // create grid with grid size
        final int gridSizeX = 3;
        final int gridSizeY = 2;

        // create the gdi position object to place images as grid layout
        final GridPosition grid = new GridPosition(gridSizeX, gridSizeY);

        // set the margin size
        final int marginTop = 20;
        final int marginRight = 5;
        final int marginBottom = 20;
        final int marginLeft = 5;

        grid.setMarginLeft(marginLeft);
        grid.setMarginRight(marginRight);
        grid.setMarginTop(marginTop);
        grid.setMarginBottom(marginBottom);

        for (int y = 0; y < gridSizeY; y++) {

            for (int x = 0; x < gridSizeX; x++) {
                // put the object at position
                igCanvas.put(igObject, grid.setPosition(x, y));

            }
        }

        // show preview window
        igCanvas.showPreviewWindow();

    }
}
