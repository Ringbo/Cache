diff --git a/bundles/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/client/HomegearClient.java b/bundles/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/client/HomegearClient.java
index 4fc5f47..8ab97ff 100644
--- a/bundles/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/client/HomegearClient.java
+++ b/bundles/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/client/HomegearClient.java
@@ -253,7 +253,7 @@
 		HmVariable var = new HmVariable();
 		var.setName(name);
 		var.setWriteable(true);
-		var.setValue(guessType(value));
+		var.setValueType(guessType(value));
 		var.setValue(value);
 		return var;
 	}
