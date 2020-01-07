package com.rc.dp.pattern;

/**
 * @ClassName RectObject
 * @Description TODO
 * @Author liux
 * @Date 19-11-27 上午12:57
 * @Version 1.0
 */
public class RectObject {
    public int x;
    public int y;
    public RectObject(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        final RectObject other = (RectObject)obj;
        if(x != other.x){
            return false;
        }
        if(y != other.y){
            return false;
        }
        return true;
    }
}
