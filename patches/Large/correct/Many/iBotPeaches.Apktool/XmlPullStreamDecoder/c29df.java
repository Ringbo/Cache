diff --git a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/XmlPullStreamDecoder.java b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/XmlPullStreamDecoder.java
index c80c81a..d5207ad 100644
--- a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/XmlPullStreamDecoder.java
+++ b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/XmlPullStreamDecoder.java
@@ -130,7 +130,7 @@
                         }
                     }
 
-                    return resTable.getAnalysisMode();
+                    return ! resTable.getAnalysisMode();
                 }
             };
 
