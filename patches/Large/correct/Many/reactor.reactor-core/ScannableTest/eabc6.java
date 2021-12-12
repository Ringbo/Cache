diff --git a/reactor-core/src/test/java/reactor/core/ScannableTest.java b/reactor-core/src/test/java/reactor/core/ScannableTest.java
index f36b811..ff9c0ae 100644
--- a/reactor-core/src/test/java/reactor/core/ScannableTest.java
+++ b/reactor-core/src/test/java/reactor/core/ScannableTest.java
@@ -52,7 +52,7 @@
 		Scannable emptyScannable = key -> null;
 
 		assertThat(emptyScannable.scan(Scannable.Attr.BUFFERED)).isEqualTo(0);
-		assertThat(emptyScannable.scan(Scannable.Attr.LARGE_BUFFERED)).isEqualTo(0L);
+		assertThat(emptyScannable.scan(Scannable.Attr.LARGE_BUFFERED)).isNull();
 		assertThat(emptyScannable.scan(Scannable.Attr.CAPACITY)).isEqualTo(0);
 		assertThat(emptyScannable.scan(Scannable.Attr.PREFETCH)).isEqualTo(0);
 
