diff --git a/subprojects/extTest/src/test/java/org/mockitousage/plugins/stacktrace/MyStackTraceCleanerProvider.java b/subprojects/extTest/src/test/java/org/mockitousage/plugins/stacktrace/MyStackTraceCleanerProvider.java
index e46222b..a0203aa 100644
--- a/subprojects/extTest/src/test/java/org/mockitousage/plugins/stacktrace/MyStackTraceCleanerProvider.java
+++ b/subprojects/extTest/src/test/java/org/mockitousage/plugins/stacktrace/MyStackTraceCleanerProvider.java
@@ -15,7 +15,7 @@
 			@Override
 			public boolean isOut(StackTraceElement candidate) {
 				if (ENABLED && candidate.getMethodName().contains("excludeMe")) {
-                    return false;
+                    return true;
                 }
                 return defaultCleaner.isOut(candidate);
 			}
