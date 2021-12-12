diff --git a/spring-test/src/main/java/org/springframework/test/web/servlet/result/StatusResultMatchers.java b/spring-test/src/main/java/org/springframework/test/web/servlet/result/StatusResultMatchers.java
index 3d1d48f..a08a223 100644
--- a/spring-test/src/main/java/org/springframework/test/web/servlet/result/StatusResultMatchers.java
+++ b/spring-test/src/main/java/org/springframework/test/web/servlet/result/StatusResultMatchers.java
@@ -73,7 +73,7 @@
 			@Override
 			public void match(MvcResult result) throws Exception {
 				assertEquals("Range for response status value " + result.getResponse().getStatus(),
-						getHttpStatusSeries(result), HttpStatus.Series.INFORMATIONAL);
+						HttpStatus.Series.INFORMATIONAL, getHttpStatusSeries(result));
 			}
 		};
 	}
@@ -86,7 +86,7 @@
 			@Override
 			public void match(MvcResult result) throws Exception {
 				assertEquals("Range for response status value " + result.getResponse().getStatus(),
-						getHttpStatusSeries(result), HttpStatus.Series.SUCCESSFUL);
+						HttpStatus.Series.SUCCESSFUL, getHttpStatusSeries(result));
 			}
 		};
 	}
@@ -99,7 +99,7 @@
 			@Override
 			public void match(MvcResult result) throws Exception {
 				assertEquals("Range for response status value " + result.getResponse().getStatus(),
-						getHttpStatusSeries(result), HttpStatus.Series.REDIRECTION);
+						HttpStatus.Series.REDIRECTION, getHttpStatusSeries(result));
 			}
 		};
 	}
@@ -112,7 +112,7 @@
 			@Override
 			public void match(MvcResult result) throws Exception {
 				assertEquals("Range for response status value " + result.getResponse().getStatus(),
-						getHttpStatusSeries(result), HttpStatus.Series.CLIENT_ERROR);
+						HttpStatus.Series.CLIENT_ERROR, getHttpStatusSeries(result));
 			}
 		};
 	}
@@ -125,7 +125,7 @@
 			@Override
 			public void match(MvcResult result) throws Exception {
 				assertEquals("Range for response status value " + result.getResponse().getStatus(),
-						getHttpStatusSeries(result), HttpStatus.Series.SERVER_ERROR);
+						HttpStatus.Series.SERVER_ERROR, getHttpStatusSeries(result));
 			}
 		};
 	}
