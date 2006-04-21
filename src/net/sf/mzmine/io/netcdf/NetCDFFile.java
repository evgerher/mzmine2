/*
 * Copyright 2006 Okinawa Institute of Science and Technology
 * 
 * This file is part of MZmine.
 * 
 * MZmine is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * MZmine is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * MZmine; if not, write to the Free Software Foundation, Inc., 51 Franklin St,
 * Fifth Floor, Boston, MA 02110-1301 USA
 */

/**
 * 
 */
package net.sf.mzmine.io.netcdf;

import java.io.File;
import java.io.IOException;

import net.sf.mzmine.io.RawDataFile;
import net.sf.mzmine.io.Scan;
import net.sf.mzmine.io.RawDataFile.PreloadLevel;

/**
 * 
 */
public class NetCDFFile implements RawDataFile {

    private File originalFile;
    
    /**
     * @see net.sf.mzmine.io.RawDataFile#getFileName()
     */
    public File getFileName() {
        return originalFile;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getNumOfScans()
     */
    public int getNumOfScans() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getMSLevels()
     */
    public int[] getMSLevels() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getScanNumbers(int)
     */
    public int[] getScanNumbers(int msLevel) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getScan(int)
     */
    public Scan getScan(int scan) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getDataDescription()
     */
    public String getDataDescription() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getDataMinMZ()
     */
    public double getDataMinMZ() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getDataMaxMZ()
     */
    public double getDataMaxMZ() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getDataMaxBasePeakIntensity()
     */
    public double getDataMaxBasePeakIntensity() {
        // TODO Auto-generated method stub
        return 0;
    }

    public String toString() {
        return originalFile.getName();
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getDataMinRT()
     */
    public double getDataMinRT() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getDataMaxRT()
     */
    public double getDataMaxRT() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getDataMaxTotalIonCurrent()
     */
    public double getDataMaxTotalIonCurrent() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getDataMaxBasePeakIntensity(int)
     */
    public double getDataMaxBasePeakIntensity(int msLevel) {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getDataMaxTotalIonCurrent(int)
     */
    public double getDataMaxTotalIonCurrent(int msLevel) {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @see net.sf.mzmine.io.RawDataFile#getPreloadLevel()
     */
    public PreloadLevel getPreloadLevel() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
