package edu.bberwald0.myfavoritetreesapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Class Description
 *
 * @author kelly.mcbean@experianinteractive.com
 *         2/12/18
 */
public class BitmapUtil {

    public static Bitmap createCircleBitmap(Context context, int imageResourceID) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), imageResourceID);
        return createCircleBitmap(bitmap);
    }

    public static Bitmap createCircleBitmap(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int diameter = bitmap.getWidth();

        if (height < width) {
            diameter = height;
        }

        final Bitmap output = Bitmap.createBitmap(diameter, diameter, Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(output);

        canvas.drawARGB(0,0,0,0);

        final int color = Color.BLACK;
        final Paint paint = new Paint();

        paint.setAntiAlias(true);
        paint.setColor(color);

        final Rect rect = new Rect(0,0,diameter,diameter);
        final RectF rectf = new RectF(rect);

        canvas.drawOval(rectf, paint);

        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));

        canvas.drawBitmap(bitmap, rect, rect, paint);

        bitmap.recycle();
        return output;
    }

}
