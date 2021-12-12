diff --git a/bigbluebutton-web/src/java/org/bigbluebutton/presentation/imp/Pdf2SwfPageConverter.java b/bigbluebutton-web/src/java/org/bigbluebutton/presentation/imp/Pdf2SwfPageConverter.java
index 8b93ef9..f93a3a5 100755
--- a/bigbluebutton-web/src/java/org/bigbluebutton/presentation/imp/Pdf2SwfPageConverter.java
+++ b/bigbluebutton-web/src/java/org/bigbluebutton/presentation/imp/Pdf2SwfPageConverter.java
@@ -65,7 +65,7 @@
           + File.separator, "pdf2swf", "-v", AVM2SWF, "-s", "poly2bitmap",
           "-F", fontsDir, "-p", String.valueOf(page), source, "-o", dest));
       Pdf2SwfPageConverterHandler pBmpHandler = new Pdf2SwfPageConverterHandler();
-      pb.setProcessListener(pBmpHandler);
+      pbBmp.setProcessListener(pBmpHandler);
       NuProcess processBmp = pbBmp.start();
       try {
         processBmp.waitFor(60, TimeUnit.SECONDS);
