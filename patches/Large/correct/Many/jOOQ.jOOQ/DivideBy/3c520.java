diff --git a/jOOQ/src/main/java/org/jooq/impl/DivideBy.java b/jOOQ/src/main/java/org/jooq/impl/DivideBy.java
index 98046e8..de7e874 100644
--- a/jOOQ/src/main/java/org/jooq/impl/DivideBy.java
+++ b/jOOQ/src/main/java/org/jooq/impl/DivideBy.java
@@ -193,109 +193,109 @@
     // ------------------------------------------------------------------------
 
     @Override
-    public final DivideBy on(Condition... conditions) {
+    public final DivideByOnConditionStep on(Condition... conditions) {
         condition.addConditions(conditions);
         return this;
     }
 
     @Override
-    public final DivideBy on(String sql) {
+    public final DivideByOnConditionStep on(String sql) {
         and(sql);
         return this;
     }
 
     @Override
-    public final DivideBy on(String sql, Object... bindings) {
+    public final DivideByOnConditionStep on(String sql, Object... bindings) {
         and(sql, bindings);
         return this;
     }
 
     @Override
-    public final DivideBy on(String sql, QueryPart... parts) {
+    public final DivideByOnConditionStep on(String sql, QueryPart... parts) {
         and(sql, parts);
         return this;
     }
 
     @Override
-    public final DivideBy returning(Field<?>... fields) {
+    public final Table<Record> returning(Field<?>... fields) {
         return returning(Arrays.asList(fields));
     }
 
     @Override
-    public final DivideBy returning(Collection<? extends Field<?>> fields) {
+    public final Table<Record> returning(Collection<? extends Field<?>> fields) {
         returning.addAll(fields);
         return this;
     }
 
     @Override
-    public final DivideBy and(Condition c) {
+    public final DivideByOnConditionStep and(Condition c) {
         condition.addConditions(c);
         return this;
     }
 
     @Override
-    public final DivideBy and(String sql) {
+    public final DivideByOnConditionStep and(String sql) {
         return and(condition(sql));
     }
 
     @Override
-    public final DivideBy and(String sql, Object... bindings) {
+    public final DivideByOnConditionStep and(String sql, Object... bindings) {
         return and(condition(sql, bindings));
     }
 
     @Override
-    public final DivideBy and(String sql, QueryPart... parts) {
+    public final DivideByOnConditionStep and(String sql, QueryPart... parts) {
         return and(condition(sql, parts));
     }
 
     @Override
-    public final DivideBy andNot(Condition c) {
+    public final DivideByOnConditionStep andNot(Condition c) {
         return and(c.not());
     }
 
     @Override
-    public final DivideBy andExists(Select<?> select) {
+    public final DivideByOnConditionStep andExists(Select<?> select) {
         return and(exists(select));
     }
 
     @Override
-    public final DivideBy andNotExists(Select<?> select) {
+    public final DivideByOnConditionStep andNotExists(Select<?> select) {
         return and(notExists(select));
     }
 
     @Override
-    public final DivideBy or(Condition c) {
+    public final DivideByOnConditionStep or(Condition c) {
         condition.addConditions(Operator.OR, c);
         return this;
     }
 
     @Override
-    public final DivideBy or(String sql) {
+    public final DivideByOnConditionStep or(String sql) {
         return or(condition(sql));
     }
 
     @Override
-    public final DivideBy or(String sql, Object... bindings) {
+    public final DivideByOnConditionStep or(String sql, Object... bindings) {
         return or(condition(sql, bindings));
     }
 
     @Override
-    public final DivideBy or(String sql, QueryPart... parts) {
+    public final DivideByOnConditionStep or(String sql, QueryPart... parts) {
         return or(condition(sql, parts));
     }
 
     @Override
-    public final DivideBy orNot(Condition c) {
+    public final DivideByOnConditionStep orNot(Condition c) {
         return or(c.not());
     }
 
     @Override
-    public final DivideBy orExists(Select<?> select) {
+    public final DivideByOnConditionStep orExists(Select<?> select) {
         return or(exists(select));
     }
 
     @Override
-    public final DivideBy orNotExists(Select<?> select) {
+    public final DivideByOnConditionStep orNotExists(Select<?> select) {
         return or(notExists(select));
     }
 }
