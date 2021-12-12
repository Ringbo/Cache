diff --git a/src/main/java/org/havenapp/main/ui/EventTriggerAdapter.java b/src/main/java/org/havenapp/main/ui/EventTriggerAdapter.java
index 1282b53..e619037 100644
--- a/src/main/java/org/havenapp/main/ui/EventTriggerAdapter.java
+++ b/src/main/java/org/havenapp/main/ui/EventTriggerAdapter.java
@@ -103,7 +103,7 @@
                     break;
                 case EventTrigger.CAMERA:
                     holder.image.setVisibility(View.VISIBLE);
-                    Picasso.get().load(new File(eventTrigger.getPath())).into(holder.image);
+                    Picasso.with(context).load(new File(eventTrigger.getPath())).into(holder.image);
                     holder.image.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {
