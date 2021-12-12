diff --git a/reactor-core/src/test/java/reactor/core/publisher/SerializedSubscriberTest.java b/reactor-core/src/test/java/reactor/core/publisher/SerializedSubscriberTest.java
index baa53a4..669e14e 100644
--- a/reactor-core/src/test/java/reactor/core/publisher/SerializedSubscriberTest.java
+++ b/reactor-core/src/test/java/reactor/core/publisher/SerializedSubscriberTest.java
@@ -59,7 +59,7 @@
 		test.tail.count = Integer.MAX_VALUE;
 
 		assertThat(test.scan(Scannable.Attr.BUFFERED)).isEqualTo(Integer.MAX_VALUE);
-		assertThat(test.scan(Scannable.Attr.LARGE_BUFFERED)).isEqualTo(0L);
+		assertThat(test.scan(Scannable.Attr.LARGE_BUFFERED)).isNull();
 	}
 
 }
\ No newline at end of file
