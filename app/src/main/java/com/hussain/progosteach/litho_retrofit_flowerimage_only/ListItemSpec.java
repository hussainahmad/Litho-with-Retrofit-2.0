package com.hussain.progosteach.litho_retrofit_flowerimage_only;

import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;

/**
 * Created by Hussain Sherwani on 17-May-17
 * hussain.ahmed@progos.org .
 */

@LayoutSpec
public class ListItemSpec {
    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop int color,
            @Prop String title,
            @Prop String subtitle
         /*   @Prop String subtitle1,
            @Prop String subtitle2,
            @Prop String subtitle3,
            @Prop String subtitle4*/
    ) {

        return Column.create(c)
                .paddingDip(YogaEdge.ALL, 16)
                .backgroundColor(color)
                .child(
                        Text.create(c)
                                .text(title)
                                .textSizeSp(40))
                .child(

                        Text.create(c)
                                .text(subtitle)
                                .textSizeSp(20))
                /*.child(

                        Text.create(c)
                                .text(subtitle1)
                                .textSizeSp(20))
                .child(
                        Text.create(c)
                                .text(subtitle2)
                                .textSizeSp(20))
                .child(
                        Text.create(c)
                                .text(subtitle3)
                                .textSizeSp(20))
                  .child(
                        Text.create(c)
                                .text(subtitle4)
                                .textSizeSp(20))*/
                .build();
    }
}
