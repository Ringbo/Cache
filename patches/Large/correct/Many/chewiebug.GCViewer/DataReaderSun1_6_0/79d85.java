diff --git a/src/main/java/com/tagtraum/perf/gcviewer/imp/DataReaderSun1_6_0.java b/src/main/java/com/tagtraum/perf/gcviewer/imp/DataReaderSun1_6_0.java
index d925bc8..fa32f02 100644
--- a/src/main/java/com/tagtraum/perf/gcviewer/imp/DataReaderSun1_6_0.java
+++ b/src/main/java/com/tagtraum/perf/gcviewer/imp/DataReaderSun1_6_0.java
@@ -72,7 +72,6 @@
     }
     
     private static final String EVENT_YG_OCCUPANCY = "YG occupancy";
-    // TODO is combination with DefNew also possible?
     private static final String EVENT_PARNEW = "ParNew";
     private static final String EVENT_DEFNEW = "DefNew";
     
@@ -119,7 +118,7 @@
     // pattern looks always like "...[CMS<datestamp>..." or "...[CMS<timestamp>..."
     // the next line starts with " (concurrent mode failure)" which in earlier releases followed "CMS" immediately
     // the same can happen with "...ParNew<timestamp|datestamp>..."
-    private static Pattern linesMixedPattern = Pattern.compile("(.* \\[(CMS|ParNew))([0-9]+[-.].*)");
+    private static Pattern linesMixedPattern = Pattern.compile("(.* \\[(CMS|ParNew|DefNew))([0-9]+[-.].*)");
     // Matcher group of start of line
     private static final int LINES_MIXED_STARTOFLINE_GROUP = 1;
     // Matcher group of end of line
@@ -234,10 +233,10 @@
                         continue;
                     }
                     model.add(parseLine(line, parsePosition));
-                } catch (ParseException pe) {
+                } catch (Exception pe) {
                     if (LOG.isLoggable(Level.WARNING)) LOG.warning(pe.toString());
                     if (LOG.isLoggable(Level.FINE)) LOG.log(Level.FINE, pe.getMessage(), pe);
-                    beginningOfLine = null;
+                    beginningOfLine.clear();
                 }
                 // reset ParsePosition
                 parsePosition.setIndex(0);
