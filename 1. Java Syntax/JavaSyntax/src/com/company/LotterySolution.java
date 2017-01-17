package com.company;

/**
 * Created by Simona Simeonova on 17-Jan-17.
 */
public class LotterySolution {
    public static void main(String[] args) {
        for (int i1=1; i1<10; i1++) {
            for (int i2=i1+1; i2<10; i2++) {
                for (int i3=i2+1; i3<10; i3++) {
                    for (int i4=i3+1; i4<10; i4++) {
                        for (int i5=i4+1; i5<10; i5++) {
                            for (int i6=i5+1; i6<11; i6++) {
                                System.out.format("%d %d %d %d %d %d\n", i1, i2, i3, i4, i5, i6);
                            }}}}}}
    }
}
