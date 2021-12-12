diff --git a/maven-reporting/maven-reporting-impl/src/main/java/org/apache/maven/reporting/AbstractMavenMultiPageReport.java b/maven-reporting/maven-reporting-impl/src/main/java/org/apache/maven/reporting/AbstractMavenMultiPageReport.java
index 1b36d4a..5fbe8cd 100644
--- a/maven-reporting/maven-reporting-impl/src/main/java/org/apache/maven/reporting/AbstractMavenMultiPageReport.java
+++ b/maven-reporting/maven-reporting-impl/src/main/java/org/apache/maven/reporting/AbstractMavenMultiPageReport.java
@@ -108,13 +108,13 @@
                 MultiPageSink currentSink = (MultiPageSink) i.next();
 
                 currentSink.paragraph();
-                for ( Iterator j = sinks.iterator(); i.hasNext(); )
+                for ( Iterator j = sinks.iterator(); j.hasNext(); )
                 {
                     if ( counter > 1 )
                     {
                         currentSink.text( "&nbsp;" );
                     }
-                    MultiPageSink sink = (MultiPageSink) i.next();
+                    MultiPageSink sink = (MultiPageSink) j.next();
                     sink.link( sink.getOutputName() + ".html" );
                     sink.text( String.valueOf( counter++ ) );
                     sink.link_();
