/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class IImpedanceControl {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IImpedanceControl(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IImpedanceControl obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_IImpedanceControl(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean getAxes(SWIGTYPE_p_int ax) {
    return yarpJNI.IImpedanceControl_getAxes(swigCPtr, this, SWIGTYPE_p_int.getCPtr(ax));
  }

  public boolean getImpedance(int j, SWIGTYPE_p_double stiffness, SWIGTYPE_p_double damping) {
    return yarpJNI.IImpedanceControl_getImpedance(swigCPtr, this, j, SWIGTYPE_p_double.getCPtr(stiffness), SWIGTYPE_p_double.getCPtr(damping));
  }

  public boolean setImpedance(int j, double stiffness, double damping) {
    return yarpJNI.IImpedanceControl_setImpedance(swigCPtr, this, j, stiffness, damping);
  }

  public boolean setImpedanceOffset(int j, double offset) {
    return yarpJNI.IImpedanceControl_setImpedanceOffset(swigCPtr, this, j, offset);
  }

  public boolean getImpedanceOffset(int j, SWIGTYPE_p_double offset) {
    return yarpJNI.IImpedanceControl_getImpedanceOffset(swigCPtr, this, j, SWIGTYPE_p_double.getCPtr(offset));
  }

  public boolean getCurrentImpedanceLimit(int j, SWIGTYPE_p_double min_stiff, SWIGTYPE_p_double max_stiff, SWIGTYPE_p_double min_damp, SWIGTYPE_p_double max_damp) {
    return yarpJNI.IImpedanceControl_getCurrentImpedanceLimit(swigCPtr, this, j, SWIGTYPE_p_double.getCPtr(min_stiff), SWIGTYPE_p_double.getCPtr(max_stiff), SWIGTYPE_p_double.getCPtr(min_damp), SWIGTYPE_p_double.getCPtr(max_damp));
  }

}
