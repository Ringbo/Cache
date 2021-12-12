diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/api/SeverityLevelCounterTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/api/SeverityLevelCounterTest.java
index 2628ea7..c1d7cc7 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/api/SeverityLevelCounterTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/api/SeverityLevelCounterTest.java
@@ -35,7 +35,7 @@
         final SeverityLevelCounter counter = new SeverityLevelCounter(SeverityLevel.ERROR);
         final AuditEvent event = new AuditEvent(this, "ATest.java", null);
         assertEquals(0, counter.getCount());
-        counter.addException(event, new IllegalStateException());
+        counter.addException(event, new IllegalStateException("Test IllegalStateException"));
         assertEquals(1, counter.getCount());
     }
 
@@ -44,7 +44,7 @@
         final SeverityLevelCounter counter = new SeverityLevelCounter(SeverityLevel.WARNING);
         final AuditEvent event = new AuditEvent(this, "ATest.java", null);
         assertEquals(0, counter.getCount());
-        counter.addException(event, new IllegalStateException());
+        counter.addException(event, new IllegalStateException("Test IllegalStateException"));
         assertEquals(0, counter.getCount());
     }
 }
