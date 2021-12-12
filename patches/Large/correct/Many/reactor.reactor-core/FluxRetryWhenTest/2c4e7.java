diff --git a/reactor-core/src/test/java/reactor/core/publisher/FluxRetryWhenTest.java b/reactor-core/src/test/java/reactor/core/publisher/FluxRetryWhenTest.java
index 7346ad7..f48a3a4 100644
--- a/reactor-core/src/test/java/reactor/core/publisher/FluxRetryWhenTest.java
+++ b/reactor-core/src/test/java/reactor/core/publisher/FluxRetryWhenTest.java
@@ -463,12 +463,13 @@
 				    .doOnNext(elapsed -> { if (elapsed.getT2() == 0) elapsedList.add(elapsed.getT1());} )
 				    .map(Tuple2::getT2)
 		)
-		            .thenAwait(Duration.ofSeconds(2))
+		            .thenAwait(Duration.ofMinutes(1)) //ensure whatever the jittered delay that we have time to fit 4 retries
 		            .expectNext(0, 1) //normal output
 		            .expectNext(0, 1, 0, 1, 0, 1, 0, 1) //4 retry attempts
-		            .verifyErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
+		            .expectErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
 		                                                    .hasMessage("Retries exhausted: 4/4")
-		                                                    .hasCause(exception));
+		                                                    .hasCause(exception))
+		            .verify(Duration.ofSeconds(1)); //vts test shouldn't even take that long
 
 		assertThat(elapsedList).hasSize(5);
 		assertThat(elapsedList, LongAssert.class).first()
@@ -495,12 +496,13 @@
 				    .doOnNext(elapsed -> { if (elapsed.getT2() == 0) elapsedList.add(elapsed.getT1());} )
 				    .map(Tuple2::getT2)
 		)
-		            .thenAwait(Duration.ofSeconds(2))
+		            .thenAwait(Duration.ofMinutes(1)) //ensure whatever the jittered delay that we have time to fit 4 retries
 		            .expectNext(0, 1) //normal output
 		            .expectNext(0, 1, 0, 1, 0, 1, 0, 1) //4 retry attempts
-		            .verifyErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
+		            .expectErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
 		                                                    .hasMessage("Retries exhausted: 4/4")
-		                                                    .hasCause(exception));
+		                                                    .hasCause(exception))
+		            .verify(Duration.ofSeconds(1)); //vts test shouldn't even take that long
 
 		assertThat(elapsedList).hasSize(5);
 		assertThat(elapsedList, LongAssert.class).first()
@@ -528,12 +530,13 @@
 				    .doOnNext(elapsed -> { if (elapsed.getT2() == 0) elapsedList.add(elapsed.getT1());} )
 				    .map(Tuple2::getT2)
 		)
-		            .thenAwait(Duration.ofSeconds(3))
+		            .thenAwait(Duration.ofMinutes(1)) //ensure whatever the jittered delay that we have time to fit 4 retries
 		            .expectNext(0, 1) //normal output
 		            .expectNext(0, 1, 0, 1, 0, 1, 0, 1) //4 retry attempts
-		            .verifyErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
+		            .expectErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
 		                                                    .hasMessage("Retries exhausted: 4/4")
-		                                                    .hasCause(exception));
+		                                                    .hasCause(exception))
+		            .verify(Duration.ofSeconds(1)); //vts test shouldn't even take that long
 
 		assertThat(elapsedList).hasSize(5);
 		assertThat(elapsedList, LongAssert.class).first()
@@ -560,12 +563,13 @@
 				    .doOnNext(elapsed -> { if (elapsed.getT2() == 0) elapsedList.add(elapsed.getT1());} )
 				    .map(Tuple2::getT2)
 		)
-		            .thenAwait(Duration.ofSeconds(2))
+		            .thenAwait(Duration.ofMinutes(1)) //ensure whatever the jittered delay that we have time to fit 4 retries
 		            .expectNext(0, 1) //normal output
 		            .expectNext(0, 1, 0, 1, 0, 1, 0, 1) //4 retry attempts
-		            .verifyErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
+		            .expectErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
 		                                                    .hasMessage("Retries exhausted: 4/4")
-		                                                    .hasCause(exception));
+		                                                    .hasCause(exception))
+		            .verify(Duration.ofSeconds(1)); //vts test shouldn't even take that long
 
 		assertThat(elapsedList).hasSize(5);
 		assertThat(elapsedList, LongAssert.class)
@@ -603,12 +607,13 @@
 					    .doOnNext(elapsed -> { if (elapsed.getT2() == 0) elapsedList.add(elapsed.getT1());} )
 					    .map(Tuple2::getT2)
 			)
-			            .thenAwait(Duration.ofSeconds(2))
+			            .thenAwait(Duration.ofMinutes(1)) //ensure whatever the jittered delay that we have time to fit 4 retries
 			            .expectNext(0, 1) //normal output
 			            .expectNext(0, 1) //1 retry attempts
-			            .verifyErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
+			            .expectErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
 			                                                    .hasMessage("Retries exhausted: 1/1")
-			                                                    .hasCause(exception));
+			                                                    .hasCause(exception))
+			            .verify(Duration.ofSeconds(1)); //vts test shouldn't even take that long
 
 			assertThat(elapsedList).hasSize(2);
 			assertThat(elapsedList, LongAssert.class)
@@ -633,12 +638,13 @@
 				    .doOnNext(elapsed -> { if (elapsed.getT2() == 0) elapsedList.add(elapsed.getT1());} )
 				    .map(Tuple2::getT2)
 		)
-		            .thenAwait(Duration.ofSeconds(2))
+		            .thenAwait(Duration.ofMinutes(1)) //ensure whatever the jittered delay that we have time to fit 4 retries
 		            .expectNext(0, 1) //normal output
 		            .expectNext(0, 1, 0, 1, 0, 1, 0, 1) //4 retry attempts
-		            .verifyErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
+		            .expectErrorSatisfies(e -> assertThat(e).isInstanceOf(IllegalStateException.class)
 		                                                    .hasMessage("Retries exhausted: 4/4")
-		                                                    .hasCause(exception));
+		                                                    .hasCause(exception))
+		            .verify(Duration.ofSeconds(1)); //vts test shouldn't even take that long
 
 		assertThat(elapsedList).containsExactly(0L, 100L, 200L, 400L, 800L);
 	}
