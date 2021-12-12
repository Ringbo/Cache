diff --git a/src/java/net/sf/jabref/JabRefFrame.java b/src/java/net/sf/jabref/JabRefFrame.java
index 255b0a8..c6eaa32 100644
--- a/src/java/net/sf/jabref/JabRefFrame.java
+++ b/src/java/net/sf/jabref/JabRefFrame.java
@@ -547,7 +547,7 @@
           }
         }
         if (baseAt(i).getFile() != null) {
-          filenames.add(baseAt(i).getFile().getPath());
+          filenames.add(baseAt(i).getFile().getAbsolutePath());
         }
       }
     }
