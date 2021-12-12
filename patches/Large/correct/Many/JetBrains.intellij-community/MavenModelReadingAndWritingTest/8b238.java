diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenModelReadingAndWritingTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenModelReadingAndWritingTest.java
index bc9d3bf..1aef592 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenModelReadingAndWritingTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenModelReadingAndWritingTest.java
@@ -43,7 +43,7 @@
       }
     }, null, null);
 
-    assertEquals("<?xml version=\"1.0\"?>\r\n" +
+    assertSameLines("<?xml version=\"1.0\"?>\r\n" +
                  "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" +
                  "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\r\n" +
                  "    <modelVersion>4.0.0</modelVersion>\r\n" +
@@ -68,7 +68,7 @@
       }
     }, null, null);
 
-    assertEquals("<?xml version=\"1.0\"?>\r\n" +
+    assertSameLines("<?xml version=\"1.0\"?>\r\n" +
                  "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" +
                  "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\r\n" +
                  "    <modelVersion>4.0.0</modelVersion>\r\n" +
