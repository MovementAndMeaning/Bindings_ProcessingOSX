/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class Vocab {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Vocab(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Vocab obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_Vocab(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static int encode(String str) {
    return yarpJNI.Vocab_encode(str);
  }

  public static ConstString decode(int code) {
    return new ConstString(yarpJNI.Vocab_decode(code), true);
  }

  public Vocab() {
    this(yarpJNI.new_Vocab(), true);
  }

}
