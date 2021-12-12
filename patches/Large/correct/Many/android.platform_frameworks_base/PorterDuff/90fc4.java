diff --git a/graphics/java/android/graphics/PorterDuff.java b/graphics/java/android/graphics/PorterDuff.java
index 2bbbff3..d7d3049 100644
--- a/graphics/java/android/graphics/PorterDuff.java
+++ b/graphics/java/android/graphics/PorterDuff.java
@@ -16,46 +16,345 @@
 
 package android.graphics;
 
+/**
+ * <p>This class contains the list of alpha compositing and blending modes
+ * that can be passed to {@link PorterDuffXfermode}, a specialized implementation
+ * of {@link Paint}'s {@link Paint#setXfermode(Xfermode) transfer mode}.
+ * All the available modes can be found in the {@link Mode} enum.</p>
+ */
 public class PorterDuff {
+    /**
+     * {@usesMathJax}
+     *
+     * <h3>Porter-Duff</h3>
+     *
+     * <p>The name of the parent class is an homage to the work of Thomas Porter and
+     * Tom Duff, presented in their seminal 1984 paper titled "Compositing Digital Images".
+     * In this paper, the authors describe 12 compositing operators that govern how to
+     * compute the color resulting of the composition of a source (the graphics object
+     * to render) with a destination (the content of the render target).</p>
+     *
+     * <p>"Compositing Digital Images" was published in <em>Computer Graphics</em>
+     * Volume 18, Number 3 dated July 1984.</p>
+     *
+     * <p>Because the work of Porter and Duff focuses solely on the effects of the alpha
+     * channel of the source and destination, the 12 operators described in the original
+     * paper are called alpha compositing modes here.</p>
+     *
+     * <p>For convenience, this class also provides several blending modes, which similarly
+     * define the result of compositing a source and a destination but without being
+     * constrained to the alpha channel. These blending modes are not defined by Porter
+     * and Duff but have been included in this class for convenience purposes.</p>
+     *
+     * <h3>Diagrams</h3>
+     *
+     * <p>All the example diagrams presented below use the same source and destination
+     * images:</p>
+     *
+     * <table summary="Source and Destination" style="background-color: transparent;">
+     *     <tr>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_SRC.png" />
+     *             <figcaption>Source image</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_DST.png" />
+     *             <figcaption>Destination image</figcaption>
+     *         </td>
+     *     </tr>
+     * </table>
+     *
+     * <p>The order of drawing operations used to generate each diagram is shown in the
+     * following code snippet:</p>
+     *
+     * <pre class="prettyprint">
+     * Paint paint = new Paint();
+     * canvas.drawBitmap(destinationImage, 0, 0, paint);
+     *
+     * PorterDuff.Mode mode = // choose a mode
+     * paint.setXfermode(new PorterDuffXfermode(mode));
+     *
+     * canvas.drawBitmap(sourceImage, 0, 0, paint);
+     * </pre>
 
-    // these value must match their native equivalents. See SkXfermode.h
+     *
+     * <h3>Alpha compositing modes</h3>
+     *
+     * <table summary="Alpha compositing modes" style="background-color: transparent;">
+     *     <tr>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_SRC.png" />
+     *             <figcaption>{@link #SRC Source}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_SRC_OVER.png" />
+     *             <figcaption>{@link #SRC_OVER Source Over}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_SRC_IN.png" />
+     *             <figcaption>{@link #SRC_IN Source In}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_SRC_ATOP.png" />
+     *             <figcaption>{@link #SRC_ATOP Source Atop}</figcaption>
+     *         </td>
+     *     </tr>
+     *     <tr>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_DST.png" />
+     *             <figcaption>{@link #DST Destination}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_DST_OVER.png" />
+     *             <figcaption>{@link #DST_OVER Destination Over}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_DST_IN.png" />
+     *             <figcaption>{@link #DST_IN Destination In}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_DST_ATOP.png" />
+     *             <figcaption>{@link #DST_ATOP Destination Atop}</figcaption>
+     *         </td>
+     *     </tr>
+     *     <tr>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_CLEAR.png" />
+     *             <figcaption>{@link #CLEAR Clear}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_SRC_OUT.png" />
+     *             <figcaption>{@link #SRC_OUT Source Out}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_DST_OUT.png" />
+     *             <figcaption>{@link #DST_OUT Destination Out}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_XOR.png" />
+     *             <figcaption>{@link #XOR Exclusive Or}</figcaption>
+     *         </td>
+     *     </tr>
+     * </table>
+     *
+     * <h3>Blending modes</h3>
+     *
+     * <table summary="Blending modes" style="background-color: transparent;">
+     *     <tr>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_DARKEN.png" />
+     *             <figcaption>{@link #DARKEN Darken}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_LIGHTEN.png" />
+     *             <figcaption>{@link #LIGHTEN Lighten}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_MULTIPLY.png" />
+     *             <figcaption>{@link #MULTIPLY Multiply}</figcaption>
+     *         </td>
+     *     </tr>
+     *     <tr>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_SCREEN.png" />
+     *             <figcaption>{@link #SCREEN Screen}</figcaption>
+     *         </td>
+     *         <td style="border: none; text-align: center;">
+     *             <img src="{@docRoot}reference/android/images/graphics/composite_OVERLAY.png" />
+     *             <figcaption>{@link #OVERLAY Overlay}</figcaption>
+     *         </td>
+     *     </tr>
+     * </table>
+     *
+     * <h3>Compositing equations</h3>
+     *
+     * <p>The documentation of each individual alpha compositing or blending mode below
+     * provides the exact equation used to compute alpha and color value of the result
+     * of the composition of a source and destination.</p>
+     *
+     * <p>The result (or output) alpha value is noted \(\alpha_{out}\). The result (or output)
+     * color value is noted \(C_{out}\).</p>
+     */
     public enum Mode {
-        /** [0, 0] */
+        // these value must match their native equivalents. See SkXfermode.h
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_CLEAR.png" />
+         *     <figcaption>Destination pixels covered by the source are cleared to 0.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = 0\)</p>
+         * <p>\(C_{out} = 0\)</p>
+         */
         CLEAR       (0),
-        /** [Sa, Sc] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_SRC.png" />
+         *     <figcaption>The source pixels replace the destination pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{src}\)</p>
+         * <p>\(C_{out} = C_{src}\)</p>
+         */
         SRC         (1),
-        /** [Da, Dc] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_DST.png" />
+         *     <figcaption>The source pixels are discarded, leaving the destination intact.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{dst}\)</p>
+         * <p>\(C_{out} = C_{dst}\)</p>
+         */
         DST         (2),
-        /** [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_SRC_OVER.png" />
+         *     <figcaption>The source pixels are drawn over the destination pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{src} + (1 - \alpha_{src}) * \alpha_{dst}\)</p>
+         * <p>\(C_{out} = C_{src} + (1 - \alpha_{src}) * C_{dst}\)</p>
+         */
         SRC_OVER    (3),
-        /** [Sa + (1 - Sa)*Da, Rc = Dc + (1 - Da)*Sc] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_DST_OVER.png" />
+         *     <figcaption>The source pixels are drawn behind the destination pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{dst} + (1 - \alpha_{dst}) * \alpha_{src}\)</p>
+         * <p>\(C_{out} = C_{dst} + (1 - \alpha_{dst}) * C_{src}\)</p>
+         */
         DST_OVER    (4),
-        /** [Sa * Da, Sc * Da] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_SRC_IN.png" />
+         *     <figcaption>Keeps the source pixels that cover the destination pixels,
+         *     discards the remaining source and destination pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{src} * \alpha_{dst}\)</p>
+         * <p>\(C_{out} = C_{src} * \alpha_{dst}\)</p>
+         */
         SRC_IN      (5),
-        /** [Sa * Da, Sa * Dc] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_DST_IN.png" />
+         *     <figcaption>Keeps the destination pixels that cover source pixels,
+         *     discards the remaining source and destination pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{src} * \alpha_{dst}\)</p>
+         * <p>\(C_{out} = C_{dst} * \alpha_{src}\)</p>
+         */
         DST_IN      (6),
-        /** [Sa * (1 - Da), Sc * (1 - Da)] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_SRC_OUT.png" />
+         *     <figcaption>Keeps the source pixels that do not cover destination pixels.
+         *     Discards source pixels that cover destination pixels. Discards all
+         *     destination pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = (1 - \alpha_{dst}) * \alpha_{src}\)</p>
+         * <p>\(C_{out} = (1 - \alpha_{dst}) * C_{src}\)</p>
+         */
         SRC_OUT     (7),
-        /** [Da * (1 - Sa), Dc * (1 - Sa)] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_DST_OUT.png" />
+         *     <figcaption>Keeps the destination pixels that are not covered by source pixels.
+         *     Discards destination pixels that are covered by source pixels. Discards all
+         *     source pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = (1 - \alpha_{src}) * \alpha_{dst}\)</p>
+         * <p>\(C_{out} = (1 - \alpha_{src}) * C_{dst}\)</p>
+         */
         DST_OUT     (8),
-        /** [Da, Sc * Da + (1 - Sa) * Dc] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_SRC_ATOP.png" />
+         *     <figcaption>Discards the source pixels that do not cover destination pixels.
+         *     Draws remaining source pixels over destination pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{dst}\)</p>
+         * <p>\(C_{out} = \alpha_{dst} * C_{src} + (1 - \alpha_{src}) * C_{dst}\)</p>
+         */
         SRC_ATOP    (9),
-        /** [Sa, Sa * Dc + Sc * (1 - Da)] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_DST_ATOP.png" />
+         *     <figcaption>Discards the destination pixels that are not covered by source pixels.
+         *     Draws remaining destination pixels over source pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{src}\)</p>
+         * <p>\(C_{out} = \alpha_{src} * C_{dst} + (1 - \alpha_{dst}) * C_{src}\)</p>
+         */
         DST_ATOP    (10),
-        /** [Sa + Da - 2 * Sa * Da, Sc * (1 - Da) + (1 - Sa) * Dc] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_XOR.png" />
+         *     <figcaption>Discards the source and destination pixels where source pixels
+         *     cover destination pixels. Draws remaining source pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = (1 - \alpha_{dst}) * \alpha_{src} + (1 - \alpha_{src}) * \alpha_{dst}\)</p>
+         * <p>\(C_{out} = (1 - \alpha_{dst}) * C_{src} + (1 - \alpha_{src}) * C_{dst}\)</p>
+         */
         XOR         (11),
-        /** [Sa + Da - Sa*Da,
-             Sc*(1 - Da) + Dc*(1 - Sa) + min(Sc, Dc)] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_DARKEN.png" />
+         *     <figcaption>Retains the smallest component of the source and
+         *     destination pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{src} + \alpha_{dst} - \alpha_{src} * \alpha_{dst}\)</p>
+         * <p>\(C_{out} = (1 - \alpha_{dst}) * C_{src} + (1 - \alpha_{src}) * C_{dst} + min(C_{src}, C_{dst})\)</p>
+         */
         DARKEN      (16),
-        /** [Sa + Da - Sa*Da,
-             Sc*(1 - Da) + Dc*(1 - Sa) + max(Sc, Dc)] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_LIGHTEN.png" />
+         *     <figcaption>Retains the largest component of the source and
+         *     destination pixel.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{src} + \alpha_{dst} - \alpha_{src} * \alpha_{dst}\)</p>
+         * <p>\(C_{out} = (1 - \alpha_{dst}) * C_{src} + (1 - \alpha_{src}) * C_{dst} + max(C_{src}, C_{dst})\)</p>
+         */
         LIGHTEN     (17),
-        /** [Sa * Da, Sc * Dc] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_MULTIPLY.png" />
+         *     <figcaption>Multiplies the source and destination pixels.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{src} * \alpha_{dst}\)</p>
+         * <p>\(C_{out} = C_{src} * C_{dst}\)</p>
+         */
         MULTIPLY    (13),
-        /** [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc] */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_SCREEN.png" />
+         *     <figcaption>Adds the source and destination pixels, then subtracts the
+         *     source pixels multiplied by the destination.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{src} + \alpha_{dst} - \alpha_{src} * \alpha_{dst}\)</p>
+         * <p>\(C_{out} = C_{src} + C_{dst} - C_{src} * C_{dst}\)</p>
+         */
         SCREEN      (14),
-        /** Saturate(S + D) */
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_ADD.png" />
+         *     <figcaption>Adds the source pixels to the destination pixels and saturates
+         *     the result.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = max(0, min(\alpha_{src} + \alpha_{dst}, 1))\)</p>
+         * <p>\(C_{out} = max(0, min(C_{src} + C_{dst}, 1))\)</p>
+         */
         ADD         (12),
+        /**
+         * <p>
+         *     <img src="{@docRoot}reference/android/images/graphics/composite_OVERLAY.png" />
+         *     <figcaption>Multiplies or screens the source and destination depending on the
+         *     destination color.</figcaption>
+         * </p>
+         * <p>\(\alpha_{out} = \alpha_{src} + \alpha_{dst} - \alpha_{src} * \alpha_{dst}\)</p>
+         * <p>\(\begin{equation}
+         * C_{out} = \begin{cases} 2 * C_{src} * C_{dst} & 2 * C_{dst} \lt \alpha_{dst} \\
+         * \alpha_{src} * \alpha_{dst} - 2 (\alpha_{dst} - C_{src}) (\alpha_{src} - C_{dst}) & otherwise \end{cases}
+         * \end{equation}\)</p>
+         */
         OVERLAY     (15);
 
         Mode(int nativeInt) {
@@ -71,14 +370,14 @@
     /**
      * @hide
      */
-    public static final int modeToInt(Mode mode) {
+    public static int modeToInt(Mode mode) {
         return mode.nativeInt;
     }
 
     /**
      * @hide
      */
-    public static final Mode intToMode(int val) {
+    public static Mode intToMode(int val) {
         switch (val) {
             default:
             case  0: return Mode.CLEAR;
