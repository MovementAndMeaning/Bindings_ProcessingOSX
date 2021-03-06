/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class PixelRgbInt {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PixelRgbInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PixelRgbInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_PixelRgbInt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setR(int value) {
    yarpJNI.PixelRgbInt_r_set(swigCPtr, this, value);
  }

  public int getR() {
    return yarpJNI.PixelRgbInt_r_get(swigCPtr, this);
  }

  public void setG(int value) {
    yarpJNI.PixelRgbInt_g_set(swigCPtr, this, value);
  }

  public int getG() {
    return yarpJNI.PixelRgbInt_g_get(swigCPtr, this);
  }

  public void setB(int value) {
    yarpJNI.PixelRgbInt_b_set(swigCPtr, this, value);
  }

  public int getB() {
    return yarpJNI.PixelRgbInt_b_get(swigCPtr, this);
  }

  public PixelRgbInt() {
    this(yarpJNI.new_PixelRgbInt__SWIG_0(), true);
  }

  public PixelRgbInt(int n_r, int n_g, int n_b) {
    this(yarpJNI.new_PixelRgbInt__SWIG_1(n_r, n_g, n_b), true);
  }

}
