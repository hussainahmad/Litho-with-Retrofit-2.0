package com.hussain.progosteach.litho_retrofit_flowerimage_only;

import android.graphics.Color;
import android.graphics.Typeface;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.fresco.FrescoImage;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;

/**
 * Created by Hussain Sherwani on 17-May-17
 * hussain.ahmed@progos.org .
 */


@LayoutSpec
public class ListItemSpec {

    @OnCreateLayout
    public static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop int color,
            @Prop int width,
            @Prop int height,
//            @Prop int cPriceStyle,
//            @Prop int manufacturerStyle,
            /*@Prop String currency,
            @Prop String price,*/
            @Prop String cPrice,
//            @Prop Typeface typeface,
            @Prop String instruction,
            @Prop String uriImage
            /*@Prop(optional = true) float aspectRatio*/

    )
//    Picasso.with(holder.itemView.getContext()).load(Constant.Http.FLOWER_URL + mmFlower.getPhoto()).into(holder.imageView);

    {

        final DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uriImage)
                .build();
        final ComponentLayout column = Column.create(c)
//                .marginDip(YogaEdge.ALL, 16)
                .backgroundColor(color)
                .child(
                        FrescoImage.create(c)
                                .controller(controller)
                                .failureImageRes(R.drawable.loading)
                                .placeholderImageRes(R.drawable.loading)
                                .actualImageScaleType(ScalingUtils.ScaleType.FIT_XY)
                                .withLayout()
                                .backgroundColor(Color.GRAY)
                                .widthPx(width)
                                .heightPx(height)
                )
                .child(
                        Text.create(c)
                                .text(cPrice)
                                .textColor(Color.BLACK)
                                .minLines(1)
                                .maxLines(1)
                                .typeface(Typeface.createFromAsset(c.getAssets(), "font/gotham_bold_webfont.ttf"))
                                .textSizeSp(12)
                                .withLayout()
                )
                .child(
                        Text.create(c)
                                .text(instruction)
                                .textSizeSp(12)
                                .textColor(Color.GRAY)
                                .maxLines(4)
                                .minLines(2)
                                .textSizeSp(12)
                                .typeface(Typeface.createFromAsset(c.getAssets(), "font/gotham_book_webfont.ttf"))
//                                .textStyle(Typeface.createFromAsset(c.getAssets(),"font/gotham_book_webfont.ttf"))
//                                .textStyle(manufacturerStyle)
                                .withLayout()
                        //.backgroundColor(Color.WHITE)
                )
                .build();
        return Row.create(c)
                .paddingDip(YogaEdge.BOTTOM,3)
                .paddingDip(YogaEdge.TOP,3)
                .backgroundAttr(android.R.attr.selectableItemBackground)
                .child(column)
                .build();

    }
}
