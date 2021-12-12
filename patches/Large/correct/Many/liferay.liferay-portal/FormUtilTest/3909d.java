diff --git a/modules/apps/foundation/apio-architect/apio-architect-api/src/test/java/com/liferay/apio/architect/form/FormUtilTest.java b/modules/apps/foundation/apio-architect/apio-architect-api/src/test/java/com/liferay/apio/architect/form/FormUtilTest.java
index bbf37ec..1b883fc 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-api/src/test/java/com/liferay/apio/architect/form/FormUtilTest.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-api/src/test/java/com/liferay/apio/architect/form/FormUtilTest.java
@@ -137,7 +137,7 @@
 	public void testGetOptionalDateFailsIfNotAnISO8601Date() {
 		List<Date> list = new ArrayList<>();
 
-		FieldFormConsumer<List<Date>, Date> fieldFormConsumer = getRequiredDate(
+		FieldFormConsumer<List<Date>, Date> fieldFormConsumer = getOptionalDate(
 			singletonMap("date", "2017-04-03"), list);
 
 		fieldFormConsumer.accept("date", dateList -> dateList::add);
@@ -213,7 +213,7 @@
 	public void testGetOptionalLongFailsIfNotALong() {
 		List<Long> list = new ArrayList<>();
 
-		FieldFormConsumer<List<Long>, Long> fieldFormConsumer = getRequiredLong(
+		FieldFormConsumer<List<Long>, Long> fieldFormConsumer = getOptionalLong(
 			singletonMap("long", "Apio"), list);
 
 		fieldFormConsumer.accept("long", longList -> longList::add);
@@ -252,7 +252,7 @@
 		List<String> list = new ArrayList<>();
 
 		FieldFormConsumer<List<String>, String> fieldFormConsumer =
-			getRequiredString(singletonMap("string", 42), list);
+			getOptionalString(singletonMap("string", 42), list);
 
 		fieldFormConsumer.accept("string", stringList -> stringList::add);
 	}
