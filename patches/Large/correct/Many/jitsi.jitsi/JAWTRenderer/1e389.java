diff --git a/src/net/java/sip/communicator/impl/neomedia/jmfext/media/renderer/video/JAWTRenderer.java b/src/net/java/sip/communicator/impl/neomedia/jmfext/media/renderer/video/JAWTRenderer.java
index e944cb1..e481b2a 100644
--- a/src/net/java/sip/communicator/impl/neomedia/jmfext/media/renderer/video/JAWTRenderer.java
+++ b/src/net/java/sip/communicator/impl/neomedia/jmfext/media/renderer/video/JAWTRenderer.java
@@ -73,7 +73,7 @@
      * The indicator which determines whether <tt>CALayer</tt>-based painting is
      * to be performed by <tt>JAWTRenderer</tt> on Mac OS X.
      */
-    private static final boolean USE_MACOSX_CALAYERS = false;
+    private static final boolean USE_MACOSX_CALAYERS = true;
 
     static
     {
@@ -668,6 +668,11 @@
      */
     private static class NonVideoComponent
     {
+        /**
+         * The <tt>BufferedImage</tt> into which {@link #component} is to be
+         * painted so that it can be processed and then rendered by
+         * {@link #handle}.
+         */
         private BufferedImage bufferedImage;
 
         /**
@@ -682,12 +687,31 @@
          */
         private long handle;
 
+        /**
+         * The height in pixels of {@link #bufferedImage} and {@link #rgb}.
+         */
         private int height;
 
+        /**
+         * The pixels of {@link #bufferedImage} to be processed by
+         * {@link #handle}.
+         */
         private int[] rgb;
 
+        /**
+         * The width in pixels of {@link #bufferedImage} and {@link #rgb}.
+         */
         private int width;
 
+        /**
+         * Initializes a new <tt>NonVideoComponent</tt> instance which is to
+         * paint a specific <tt>Component</tt> in the context of a parent
+         * <tt>JAWTRenderer</tt>.
+         *
+         * @param component the <tt>Component</tt> to be painted
+         * @param parentHandle the handle of the native <tt>JAWTRenderer</tt> in
+         * the context of which <tt>component</tt> is to be painted
+         */
         public NonVideoComponent(Component component, long parentHandle)
         {
             this.component = component;
@@ -710,6 +734,10 @@
             }
         }
 
+        /**
+         * Releases the resources of this <tt>NonVideoComponent</tt> and
+         * prepares it to be garbage collected.
+         */
         public void dispose()
         {
             if (handle != 0)
@@ -721,10 +749,19 @@
             }
         }
 
+        /**
+         * Paints the <tt>Component</tt> associated with this
+         * <tt>NonVideoComponent</tt> instance.
+         */
         public void paint()
         {
             if (handle != 0)
             {
+                /*
+                 * Make sure the location, the size and the visibility known to
+                 * the associated native JAWTRenderer are in sync with these of
+                 * the component.
+                 */
                 Rectangle bounds = component.getBounds();
 
                 if (!component.isVisible())
@@ -736,9 +773,17 @@
                         handle,
                         bounds.x, bounds.y, bounds.width, bounds.height);
 
+                /*
+                 * If the component is not visible, the native JAWTRenderer
+                 * already knows that it is not to be rendered.
+                 */
                 if ((bounds.height < 1) || (bounds.width < 1))
                     return;
 
+                /*
+                 * Paint the component and tell the native JAWTRenderer about
+                 * the latest painting.
+                 */
                 if ((height != bounds.height) || (width != bounds.width))
                 {
                     rgb = new int[bounds.width * bounds.height];
@@ -1167,9 +1212,18 @@
         @Override
         public boolean contains(int x, int y)
         {
+            /*
+             * Act as a "glass pane" i.e. be transparent with respect to points
+             * and pretend they are in whatever is underneath.
+             */
             return false;
         }
 
+        /**
+         * Dispatches <tt>MouseEvent</tt>s to whatever is underneath this
+         * <tt>SwingVideoComponentCanvas</tt> because it only renders
+         * <tt>Component</tt>s i.e. it is like a "glass pane".
+         */
         private boolean dispatchMouseEvent(MouseEvent e)
         {
             Component srcc = e.getComponent();
@@ -1201,6 +1255,20 @@
             return false;
         }
 
+        /**
+         * Determines the <tt>Component</tt> which is a child of a specific
+         * <tt>Container</tt> which contains a specific <tt>Point</tt>. Since
+         * <tt>SwingVideoComponentCanvas</tt> is like a "glass pane", it never
+         * contains the specified <tt>point</tt>.
+         *
+         * @param parent the <tt>Container</tt> which contains the
+         * <tt>Component</tt>s which may contain the specified <tt>point</tt>
+         * @param point the point in the coordinate system of <tt>parent</tt>
+         * which is to be determined which <tt>Component</tt> contains it
+         * @return the <tt>Component</tt> which is a child of the specified
+         * <tt>Container</tt> and contains the specified <tt>Point</tt> or
+         * <tt>null</tt> if there is no such <tt>Component</tt>
+         */
         private Component getComponentAt(Container parent, Point point)
         {
             Component[] components = parent.getComponents();
@@ -1313,6 +1381,10 @@
         @Override
         protected void processMouseEvent(MouseEvent e)
         {
+            /*
+             * Act as a "glass pane" i.e. be transparent with respect to
+             * MouseEvents and dispatch them to whatever is underneath.
+             */
             if (!dispatchMouseEvent(e))
                 super.processMouseEvent(e);
         }
@@ -1320,10 +1392,20 @@
         @Override
         protected void processMouseMotionEvent(MouseEvent e)
         {
+            /*
+             * Act as a "glass pane" i.e. be transparent with respect to
+             * MouseEvents and dispatch them to whatever is underneath.
+             */
             if (!dispatchMouseEvent(e))
                 super.processMouseMotionEvent(e);
         }
 
+        /**
+         * Removes all <tt>NonVideoComponent</tt>s from this
+         * <tt>SwingVideoComponentCanvas</tt> so that their associated
+         * <tt>Component</tt>s are no longer painted by the reperesented native
+         * <tt>JAWTRenderer</tt>.
+         */
         private void removeAllNonVideoComponents()
         {
             synchronized (nonVideoComponents)
