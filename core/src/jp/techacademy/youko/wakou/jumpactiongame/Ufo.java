package jp.techacademy.youko.wakou.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by appu2 on 2017/12/14.
 */
public class Ufo extends GameObject {

    public static final float UFO_WIDTH = 2.0f;
    public static final float UFO_HEIGHT = 1.3f;

    public Ufo(Texture texture, int srcX,int srcY,int srcWidth,int srcHeight){
        super(texture,srcX,srcY,srcWidth,srcHeight);
        setSize(UFO_WIDTH,UFO_HEIGHT);
    }
}
