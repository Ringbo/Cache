diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/MainTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/MainTest.java
index 48d28d0..b89e2cd 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/MainTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/MainTest.java
@@ -180,12 +180,10 @@
                         ResourceBundle.getBundle("checkstylecompilation");
                 String version = compilationProperties.getString("checkstyle.compile.version");
                 assertEquals(String.format("<?xml version=\"1.0\" encoding=\"UTF-8\"?>%n"
-                        + "<checkstyle version=\"" + version + "\">%n"
-                        + "<file name=\""
-                        + expectedPath
-                        + "\">%n"
+                        + "<checkstyle version=\"%s\">%n"
+                        + "<file name=\"%s\">%n"
                         + "</file>%n"
-                        + "</checkstyle>%n"), systemOut.getLog());
+                        + "</checkstyle>%n", version, expectedPath), systemOut.getLog());
                 assertEquals("", systemErr.getLog());
             }
         });
@@ -219,11 +217,11 @@
                     + "/src/test/resources/com/puppycrawl/tools/checkstyle/InputMain.java"
                     .replace("/", File.separator);
                 assertEquals(String.format("Starting audit...%n"
-                                + expectedPath + ":3:14: "
+                                + "%1$s:3:14: "
                                 + "warning: Name 'InputMain' must match pattern '^[a-z0-9]*$'.%n"
-                                + expectedPath + ":5:7: "
+                                + "%1$s:5:7: "
                                 + "warning: Name 'InputMainInner' must match pattern '^[a-z0-9]*$'.%n"
-                                + "Audit done.%n"),
+                                + "Audit done.%n", expectedPath),
                         systemOut.getLog());
                 assertEquals("", systemErr.getLog());
             }
@@ -243,12 +241,12 @@
                     + "/src/test/resources/com/puppycrawl/tools/checkstyle/InputMain.java"
                     .replace("/", File.separator);
                 assertEquals(String.format("Starting audit...%n"
-                        + expectedPath + ":3:14: "
+                        + "%1$s:3:14: "
                         + "Name 'InputMain' must match pattern '^[a-z0-9]*$'.%n"
-                        + expectedPath + ":5:7: "
+                        + "%1$s:5:7: "
                         + "Name 'InputMainInner' must match pattern '^[a-z0-9]*$'.%n"
                         + "Audit done.%n"
-                        + "Checkstyle ends with 2 errors.%n"), systemOut.getLog());
+                        + "Checkstyle ends with 2 errors.%n", expectedPath), systemOut.getLog());
                 assertEquals("", systemErr.getLog());
             }
         });
