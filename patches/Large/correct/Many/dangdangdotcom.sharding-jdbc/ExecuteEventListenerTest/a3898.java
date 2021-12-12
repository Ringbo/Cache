diff --git a/sharding-opentracing/src/test/java/io/shardingsphere/opentracing/listener/ExecuteEventListenerTest.java b/sharding-opentracing/src/test/java/io/shardingsphere/opentracing/listener/ExecuteEventListenerTest.java
index d225f2f..edd7ddf 100644
--- a/sharding-opentracing/src/test/java/io/shardingsphere/opentracing/listener/ExecuteEventListenerTest.java
+++ b/sharding-opentracing/src/test/java/io/shardingsphere/opentracing/listener/ExecuteEventListenerTest.java
@@ -73,7 +73,7 @@
         };
         sqlExecuteTemplate.execute(Collections.singleton(
                 new StatementExecuteUnit(new RouteUnit("ds_0", new SQLUnit("insert into ...", Collections.singletonList(Collections.<Object>singletonList(1)))), statement)), executeCallback);
-        assertThat(getTracer().finishedSpans().size(), is(2));
+        assertThat(getTracer().finishedSpans().size(), is(1));
     }
     
     @Test
@@ -95,7 +95,7 @@
             }
         };
         sqlExecuteTemplate.execute(statementExecuteUnits, executeCallback);
-        assertThat(getTracer().finishedSpans().size(), is(3));
+        assertThat(getTracer().finishedSpans().size(), is(2));
     }
 
     @Test
@@ -118,7 +118,7 @@
             }
         };
         sqlExecuteTemplate.execute(batchPreparedStatementExecuteUnits, executeCallback);
-        assertThat(getTracer().finishedSpans().size(), is(3));
+        assertThat(getTracer().finishedSpans().size(), is(2));
     }
     
     @Test(expected = SQLException.class)
