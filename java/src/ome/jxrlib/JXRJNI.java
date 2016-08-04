/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ome.jxrlib;

public class JXRJNI {
  public final static native void GUID_Data1_set(long jarg1, GUID jarg1_, long jarg2);
  public final static native long GUID_Data1_get(long jarg1, GUID jarg1_);
  public final static native void GUID_Data2_set(long jarg1, GUID jarg1_, int jarg2);
  public final static native int GUID_Data2_get(long jarg1, GUID jarg1_);
  public final static native void GUID_Data3_set(long jarg1, GUID jarg1_, int jarg2);
  public final static native int GUID_Data3_get(long jarg1, GUID jarg1_);
  public final static native void GUID_Data4_set(long jarg1, GUID jarg1_, short[] jarg2);
  public final static native short[] GUID_Data4_get(long jarg1, GUID jarg1_);
  public final static native long new_GUID();
  public final static native void delete_GUID(long jarg1);
  public final static native long CodecFactory_decoderFromFile(long jarg1, CodecFactory jarg1_, String jarg2);
  public final static native long CodecFactory_createFormatConverter(long jarg1, CodecFactory jarg1_, long jarg2, ImageDecoder jarg2_, String jarg3) throws ome.jxrlib.FormatError;
  public final static native long new_CodecFactory();
  public final static native void delete_CodecFactory(long jarg1);
  public final static native long Factory_createStreamFromFilename(long jarg1, Factory jarg1_, String jarg2);
  public final static native long new_Factory();
  public final static native void delete_Factory(long jarg1);
  public final static native long new_FormatConverter();
  public final static native void delete_FormatConverter(long jarg1);
  public final static native long new_FormatError(String jarg1);
  public final static native String FormatError_what(long jarg1, FormatError jarg1_);
  public final static native void delete_FormatError(long jarg1);
  public final static native void ImageDecoder_initialize(long jarg1, ImageDecoder jarg1_) throws ome.jxrlib.FormatError;
  public final static native long ImageDecoder_getFrameCount(long jarg1, ImageDecoder jarg1_) throws ome.jxrlib.FormatError;
  public final static native void ImageDecoder_selectFrame(long jarg1, ImageDecoder jarg1_, long jarg2);
  public final static native long ImageDecoder_getGUIDPixFormat(long jarg1, ImageDecoder jarg1_);
  public final static native boolean ImageDecoder_getBlackWhite(long jarg1, ImageDecoder jarg1_);
  public final static native long ImageDecoder_getWidth(long jarg1, ImageDecoder jarg1_);
  public final static native long ImageDecoder_getHeight(long jarg1, ImageDecoder jarg1_);
  public final static native long ImageDecoder_getResolution(long jarg1, ImageDecoder jarg1_) throws ome.jxrlib.FormatError;
  public final static native void ImageDecoder_close(long jarg1, ImageDecoder jarg1_);
  public final static native long new_ImageDecoder();
  public final static native void delete_ImageDecoder(long jarg1);
  public final static native long new_ImageEncoder(long jarg1, Stream jarg1_, String jarg2);
  public final static native void ImageEncoder_initializeWithDecoder(long jarg1, ImageEncoder jarg1_, long jarg2, ImageDecoder jarg2_) throws ome.jxrlib.FormatError;
  public final static native void ImageEncoder_writeSource(long jarg1, ImageEncoder jarg1_, long jarg2, FormatConverter jarg2_) throws ome.jxrlib.FormatError;
  public final static native void ImageEncoder_close(long jarg1, ImageEncoder jarg1_);
  public final static native void delete_ImageEncoder(long jarg1);
  public final static native long new_Resolution();
  public final static native void delete_Resolution(long jarg1);
  public final static native long new_Stream();
  public final static native void delete_Stream(long jarg1);
}
