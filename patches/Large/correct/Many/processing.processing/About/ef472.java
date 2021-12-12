diff --git a/app/src/processing/app/About.java b/app/src/processing/app/About.java
index f034c0a..4df3c1d 100644
--- a/app/src/processing/app/About.java
+++ b/app/src/processing/app/About.java
@@ -50,8 +50,8 @@
     g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                         RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
 
-    g.setFont(new Font("SansSerif", Font.PLAIN, 11)); //$NON-NLS-1$
+    g.setFont(new Font("SansSerif", Font.PLAIN, 10)); //$NON-NLS-1$
     g.setColor(Color.white);
-    g.drawString(Base.getVersionName(), 50, 30);
+    g.drawString(Base.getVersionName(), 90, 29);
   }
 }
\ No newline at end of file
