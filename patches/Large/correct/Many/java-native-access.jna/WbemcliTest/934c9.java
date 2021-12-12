diff --git a/contrib/platform/test/com/sun/jna/platform/win32/COM/WbemcliTest.java b/contrib/platform/test/com/sun/jna/platform/win32/COM/WbemcliTest.java
index 7422e5b..5a62765 100644
--- a/contrib/platform/test/com/sun/jna/platform/win32/COM/WbemcliTest.java
+++ b/contrib/platform/test/com/sun/jna/platform/win32/COM/WbemcliTest.java
@@ -238,7 +238,7 @@
                         assertTrue(year > 1970);
                         assertTrue(month >= 1 && month <= 12);
                         assertTrue(day >= 1 && day <= 31);
-                        assertTrue(hour >= 0 && day <= 23);
+                        assertTrue(hour >= 0 && hour <= 23);
                         assertTrue(minute >= 0 && minute <= 59);
                         assertTrue(second >= 0 && second <= 59);
                         OleAuto.INSTANCE.VariantClear(pVal);
