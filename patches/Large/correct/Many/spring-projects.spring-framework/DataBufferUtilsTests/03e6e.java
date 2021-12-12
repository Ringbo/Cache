diff --git a/spring-core/src/test/java/org/springframework/core/io/buffer/support/DataBufferUtilsTests.java b/spring-core/src/test/java/org/springframework/core/io/buffer/support/DataBufferUtilsTests.java
index fdb2d68..caf24b4 100644
--- a/spring-core/src/test/java/org/springframework/core/io/buffer/support/DataBufferUtilsTests.java
+++ b/spring-core/src/test/java/org/springframework/core/io/buffer/support/DataBufferUtilsTests.java
@@ -42,15 +42,15 @@
 				.toURI();
 		FileChannel channel = FileChannel.open(Paths.get(uri), StandardOpenOption.READ);
 
-		Flux<DataBuffer> flux = DataBufferUtils.read(channel, this.bufferFactory, 4);
+		Flux<DataBuffer> flux = DataBufferUtils.read(channel, this.bufferFactory, 3);
 
 		TestSubscriber
 				.subscribe(flux)
 				.assertNoError()
 				.assertComplete()
 				.assertValuesWith(
-						stringConsumer("foo\n"), stringConsumer("bar\n"),
-						stringConsumer("baz\n"), stringConsumer("qux\n"));
+						stringConsumer("foo"), stringConsumer("bar"),
+						stringConsumer("baz"), stringConsumer("qux"));
 
 		assertFalse(channel.isOpen());
 	}
@@ -61,16 +61,17 @@
 				.toURI();
 		FileChannel channel = FileChannel.open(Paths.get(uri), StandardOpenOption.READ);
 
-		Flux<DataBuffer> flux = DataBufferUtils.read(channel, this.bufferFactory, 3);
+		Flux<DataBuffer> flux = DataBufferUtils.read(channel, this.bufferFactory, 2);
 
 		TestSubscriber
 				.subscribe(flux)
 				.assertNoError()
 				.assertComplete()
 				.assertValuesWith(
-						stringConsumer("foo"), stringConsumer("\nba"),
-						stringConsumer("r\nb"), stringConsumer("az\n"),
-						stringConsumer("qux"), stringConsumer("\n"));
+						stringConsumer("fo"), stringConsumer("ob"),
+						stringConsumer("ar"), stringConsumer("ba"),
+						stringConsumer("zq"), stringConsumer("ux")
+				);
 
 		assertFalse(channel.isOpen());
 	}
@@ -80,15 +81,15 @@
 		InputStream is = DataBufferUtilsTests.class
 				.getResourceAsStream("DataBufferUtilsTests.txt");
 
-		Flux<DataBuffer> flux = DataBufferUtils.read(is, this.bufferFactory, 4);
+		Flux<DataBuffer> flux = DataBufferUtils.read(is, this.bufferFactory, 3);
 
 		TestSubscriber
 				.subscribe(flux)
 				.assertNoError()
 				.assertComplete()
 				.assertValuesWith(
-						stringConsumer("foo\n"), stringConsumer("bar\n"),
-						stringConsumer("baz\n"), stringConsumer("qux\n"));
+						stringConsumer("foo"), stringConsumer("bar"),
+						stringConsumer("baz"), stringConsumer("qux"));
 	}
 
 	@Test
