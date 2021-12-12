diff --git a/app/src/main/java/com/mikepenz/fastadapter/app/SampleActivity.java b/app/src/main/java/com/mikepenz/fastadapter/app/SampleActivity.java
index e093123..9050ac5 100755
--- a/app/src/main/java/com/mikepenz/fastadapter/app/SampleActivity.java
+++ b/app/src/main/java/com/mikepenz/fastadapter/app/SampleActivity.java
@@ -71,7 +71,7 @@
                         new PrimaryDrawerItem().withName(R.string.sample_collapsible).withDescription(R.string.sample_collapsible_descr).withSelectable(false).withIdentifier(2).withIcon(MaterialDesignIconic.Icon.gmi_check_all),
                         new PrimaryDrawerItem().withName(R.string.sample_sticky_header).withDescription(R.string.sample_sticky_header_descr).withSelectable(false).withIdentifier(3).withIcon(MaterialDesignIconic.Icon.gmi_format_align_left),
                         new PrimaryDrawerItem().withName(R.string.sample_advanced).withDescription(R.string.sample_advanced_descr).withSelectable(false).withIdentifier(4).withIcon(MaterialDesignIconic.Icon.gmi_coffee),
-                        new PrimaryDrawerItem().withName(R.string.sample_typed_item).withDescription(R.string.sample_typed_item_descr).withSelectable(false).withIdentifier(7).withIcon(MaterialDesignIconic.Icon.gmi_font),
+                        new PrimaryDrawerItem().withName(R.string.sample_generic_item).withDescription(R.string.sample_generic_item_descr).withSelectable(false).withIdentifier(7).withIcon(MaterialDesignIconic.Icon.gmi_font),
                         new DividerDrawerItem(),
                         new PrimaryDrawerItem().withName(R.string.open_source).withSelectable(false).withIdentifier(100).withIcon(MaterialDesignIconic.Icon.gmi_github)
                 )
@@ -93,7 +93,7 @@
                             } else if (drawerItem.getIdentifier() == 6) {
                                 intent = new Intent(SampleActivity.this, SimpleItemListActivity.class);
                             } else if (drawerItem.getIdentifier() == 7) {
-                                intent = new Intent(SampleActivity.this, TypedItemActivity.class);
+                                intent = new Intent(SampleActivity.this, GenericItemActivity.class);
                             } else if (drawerItem.getIdentifier() == 8) {
                                 intent = new Intent(SampleActivity.this, IconGridActivity.class);
                             } else if (drawerItem.getIdentifier() == 100) {
