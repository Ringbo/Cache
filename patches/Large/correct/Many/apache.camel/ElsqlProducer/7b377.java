diff --git a/components/camel-elsql/src/main/java/org/apache/camel/component/elsql/ElsqlProducer.java b/components/camel-elsql/src/main/java/org/apache/camel/component/elsql/ElsqlProducer.java
index 4575844..58feb1d 100644
--- a/components/camel-elsql/src/main/java/org/apache/camel/component/elsql/ElsqlProducer.java
+++ b/components/camel-elsql/src/main/java/org/apache/camel/component/elsql/ElsqlProducer.java
@@ -169,7 +169,7 @@
                         } else {
                              // if we are here, there isResultSet is false. This can happen only if we are doing an update operation or there is no result.
                              // we can simply add the updateCount in this case.
-                            exchange.getOut().setHeader(SqlConstants.SQL_UPDATE_COUNT, ps.getUpdateCount());
+                            exchange.getIn().setHeader(SqlConstants.SQL_UPDATE_COUNT, ps.getUpdateCount());
                         }
                     }
                     } finally {
