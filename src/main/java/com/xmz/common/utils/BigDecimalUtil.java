package com.xmz.common.utils;

import org.apache.commons.lang3.StringUtils;
import java.math.BigDecimal;

/**
 * BigDecimal小数加减乘除工具类
 * @author LiZhuang
 * @date 2023/1/6 17:56
 */
public class BigDecimalUtil {

    //*********************************************加法返回BigDecimal类型，开始*********************************************

    /**
     * BigDecimal + BigDecimal = BigDecimal
     */
    public static BigDecimal add(BigDecimal x, BigDecimal y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return x.add(y);
    }

    /**
     * BigDecimal + BigDecimal = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal add(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.add(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Double + Double = BigDecimal
     */
    public static BigDecimal add(Double x, Double y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Double + Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal add(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer + Integer = BigDecimal
     */
    public static BigDecimal add(Integer x, Integer y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Integer + Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal add(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * String + String = BigDecimal
     */
    public static BigDecimal add(String x, String y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(new BigDecimal(x), new BigDecimal(y));
    }

    /**
     * String + String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal add(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(new BigDecimal(x), new BigDecimal(y), places);
    }

    /**
     * BigDecimal + Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal add(BigDecimal x, Double y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return add(x, BigDecimal.valueOf(y));
    }

    /**
     * Double + BigDecimal = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal add(Double x, BigDecimal y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(BigDecimal.valueOf(x), y);
    }

    /**
     * BigDecimal + Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal add(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return add(x, BigDecimal.valueOf(y), places);
    }

    /**
     * Double + BigDecimal = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal add(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(BigDecimal.valueOf(x), y, places);
    }

    /**
     * BigDecimal + String = BigDecimal
     */
    public static BigDecimal add(BigDecimal x, String y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(x, new BigDecimal(y));
    }

    /**
     * String + BigDecimal = BigDecimal
     */
    public static BigDecimal add(String x, BigDecimal y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(new BigDecimal(x), y);
    }

    /**
     * BigDecimal + String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal add(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(x, new BigDecimal(y), places);
    }

    /**
     * String + BigDecimal = BigDecimal
     */
    public static BigDecimal add(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(new BigDecimal(x), y, places);
    }

    /**
     * Double + String = BigDecimal
     */
    public static BigDecimal add(Double x, String y) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y));
    }

    /**
     * String + Double = BigDecimal
     */
    public static BigDecimal add(String x,  Double y) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y));
    }

    /**
     * Double + String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal add(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y), places);
    }

    /**
     * Double + String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal add(String x, Double y, int places) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer + BigDecimal = BigDecimal
     */
    public static BigDecimal add(Integer x, BigDecimal y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(new BigDecimal(x), y);
    }

    /**
     * BigDecimal + Integer = BigDecimal
     */
    public static BigDecimal add(BigDecimal x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return add(x, new BigDecimal(y));
    }

    /**
     * Integer + BigDecimal = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal add(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(new BigDecimal(x), y, places);
    }

    /**
     * BigDecimal + Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal add(BigDecimal x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return add(x, new BigDecimal(y), places);
    }

    /**
     * Integer + Double = BigDecimal
     */
    public static BigDecimal add(Integer x, Double y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y));
    }

    /**
     * Double + Integer = BigDecimal
     */
    public static BigDecimal add(Double x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Integer + Double = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal add(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Double + Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal add(Double x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer + String = BigDecimal
     */
    public static BigDecimal add(Integer x, String y) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y));
    }

    /**
     * String + Integer = BigDecimal
     */
    public static BigDecimal add(String x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y));
    }

    /**
     * Integer + String = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal add(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y), places);
    }

    /**
     * String + Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal add(String x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y), places);
    }

    //*********************************************加法返回BigDecimal类型，结束*********************************************


    //*********************************************加法返回Double类型，开始*********************************************

    /**
     * BigDecimal + BigDecimal = Double
     */
    public static Double addToDouble(BigDecimal x, BigDecimal y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return x.add(y).doubleValue();
    }

    /**
     * BigDecimal + BigDecimal = Double
     * @param places 保留小数点后的位数
     */
    public static Double addToDouble(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.add(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * Double + Double = Double
     */
    public static Double addToDouble(Double x, Double y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double + Double = Double
     * 可指定小数点后位数
     */
    public static Double addToDouble(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer + Integer = Double
     */
    public static Double addToDouble(Integer x, Integer y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer + Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double addToDouble(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * String + String = Double
     */
    public static Double addToDouble(String x, String y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(new BigDecimal(x), new BigDecimal(y)).doubleValue();
    }

    /**
     * String + String = Double
     * 可指定小数点后位数
     */
    public static Double addToDouble(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(new BigDecimal(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * BigDecimal + Double = Double
     * 可指定小数点后位数
     */
    public static Double addToDouble(BigDecimal x, Double y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return add(x, BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double + BigDecimal = Double
     * 可指定小数点后位数
     */
    public static Double addToDouble(Double x, BigDecimal y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(BigDecimal.valueOf(x), y).doubleValue();
    }

    /**
     * BigDecimal + Double = Double
     * 可指定小数点后位数
     */
    public static Double addToDouble(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return add(x, BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Double + BigDecimal = Double
     * 可指定小数点后位数
     */
    public static Double addToDouble(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(BigDecimal.valueOf(x), y, places).doubleValue();
    }

    /**
     * BigDecimal + String = Double
     */
    public static Double addToDouble(BigDecimal x, String y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(x, new BigDecimal(y)).doubleValue();
    }

    /**
     * String + BigDecimal = Double
     */
    public static Double addToDouble(String x, BigDecimal y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(new BigDecimal(x), y).doubleValue();
    }

    /**
     * BigDecimal + String = Double
     * 可指定小数点后位数
     */
    public static Double addToDouble(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(x, new BigDecimal(y), places).doubleValue();
    }

    /**
     * String + BigDecimal = Double
     */
    public static Double addToDouble(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(new BigDecimal(x), y, places).doubleValue();
    }

    /**
     * Double + String = Double
     */
    public static Double addToDouble(Double x, String y) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y)).doubleValue();
    }

    /**
     * String + Double = Double
     */
    public static Double addToDouble(String x,  Double y) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double + String = Double
     * 可指定小数点后位数
     */
    public static Double addToDouble(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * Double + String = Double
     * 可指定小数点后位数
     */
    public static Double addToDouble(String x, Double y, int places) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer + BigDecimal = Double
     */
    public static Double addToDouble(Integer x, BigDecimal y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(BigDecimal.valueOf(x), y).doubleValue();
    }

    /**
     * BigDecimal + Integer = Double
     */
    public static Double addToDouble(BigDecimal x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return add(x, BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer + BigDecimal = Double
     * @param places 保留小数点后的位数
     */
    public static Double addToDouble(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(BigDecimal.valueOf(x), y, places).doubleValue();
    }

    /**
     * BigDecimal + Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double addToDouble(BigDecimal x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return add(x, BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer + Double = Double
     */
    public static Double addToDouble(Integer x, Double y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double + Integer = Double
     */
    public static Double addToDouble(Double x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer + Double = Double
     * @param places 保留小数点后的位数
     */
    public static Double addToDouble(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Double + Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double addToDouble(Double x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer + String = Double
     */
    public static Double addToDouble(Integer x, String y) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y)).doubleValue();
    }

    /**
     * String + Integer = Double
     */
    public static Double addToDouble(String x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer + String = Double
     * @param places 保留小数点后的位数
     */
    public static Double addToDouble(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * String + Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double addToDouble(String x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    //*********************************************加法返回Double类型，结束*********************************************


    //*********************************************加法返回String类型，开始*********************************************

    /**
     * BigDecimal + BigDecimal = String
     */
    public static String addToString(BigDecimal x, BigDecimal y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return x.add(y).toString();
    }

    /**
     * BigDecimal + BigDecimal = String
     * @param places 保留小数点后的位数
     */
    public static String addToString(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.add(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * Double + Double = String
     */
    public static String addToString(Double x, Double y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double + Double = String
     * 可指定小数点后位数
     */
    public static String addToString(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer + Integer = String
     */
    public static String addToString(Integer x, Integer y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer + Integer = String
     * @param places 保留小数点后的位数
     */
    public static String addToString(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * String + String = String
     */
    public static String addToString(String x, String y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(new BigDecimal(x), new BigDecimal(y)).toString();
    }

    /**
     * String + String = String
     * 可指定小数点后位数
     */
    public static String addToString(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(new BigDecimal(x), new BigDecimal(y), places).toString();
    }

    /**
     * BigDecimal + Double = String
     * 可指定小数点后位数
     */
    public static String addToString(BigDecimal x, Double y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return add(x, BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double + BigDecimal = String
     * 可指定小数点后位数
     */
    public static String addToString(Double x, BigDecimal y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(BigDecimal.valueOf(x), y).toString();
    }

    /**
     * BigDecimal + Double = String
     * 可指定小数点后位数
     */
    public static String addToString(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return add(x, BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Double + BigDecimal = String
     * 可指定小数点后位数
     */
    public static String addToString(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(BigDecimal.valueOf(x), y, places).toString();
    }

    /**
     * BigDecimal + String = String
     */
    public static String addToString(BigDecimal x, String y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(x, new BigDecimal(y)).toString();
    }

    /**
     * String + BigDecimal = String
     */
    public static String addToString(String x, BigDecimal y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(new BigDecimal(x), y).toString();
    }

    /**
     * BigDecimal + String = String
     * 可指定小数点后位数
     */
    public static String addToString(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(x, new BigDecimal(y), places).toString();
    }

    /**
     * String + BigDecimal = String
     */
    public static String addToString(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(new BigDecimal(x), y, places).toString();
    }

    /**
     * Double + String = String
     */
    public static String addToString(Double x, String y) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y)).toString();
    }

    /**
     * String + Double = String
     */
    public static String addToString(String x,  Double y) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double + String = String
     * 可指定小数点后位数
     */
    public static String addToString(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y), places).toString();
    }

    /**
     * Double + String = String
     * 可指定小数点后位数
     */
    public static String addToString(String x, Double y, int places) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer + BigDecimal = String
     */
    public static String addToString(Integer x, BigDecimal y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(BigDecimal.valueOf(x), y).toString();
    }

    /**
     * BigDecimal + Integer = String
     */
    public static String addToString(BigDecimal x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return add(x, BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer + BigDecimal = String
     * @param places 保留小数点后的位数
     */
    public static String addToString(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return add(BigDecimal.valueOf(x), y, places).toString();
    }

    /**
     * BigDecimal + Integer = String
     * @param places 保留小数点后的位数
     */
    public static String addToString(BigDecimal x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return add(x, BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer + Double = String
     */
    public static String addToString(Integer x, Double y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double + Integer = String
     */
    public static String addToString(Double x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer + Double = String
     * @param places 保留小数点后的位数
     */
    public static String addToString(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Double + Integer = String
     * @param places 保留小数点后的位数
     */
    public static String addToString(Double x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return add(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer + String = String
     */
    public static String addToString(Integer x, String y) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y)).toString();
    }

    /**
     * String + Integer = String
     */
    public static String addToString(String x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer + String = String
     * @param places 保留小数点后的位数
     */
    public static String addToString(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return add(BigDecimal.valueOf(x), new BigDecimal(y), places).toString();
    }

    /**
     * String + Integer = String
     * @param places 保留小数点后的位数
     */
    public static String addToString(String x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return add(new BigDecimal(x), BigDecimal.valueOf(y), places).toString();
    }

    //*********************************************加法返回String类型，结束*********************************************



    //*********************************************减法返回BigDecimal类型，开始*********************************************

    /**
     * BigDecimal - BigDecimal = BigDecimal
     */
    public static BigDecimal subtract(BigDecimal x, BigDecimal y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return x.subtract(y);
    }

    /**
     * BigDecimal - BigDecimal = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal subtract(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.subtract(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Double - Double = BigDecimal
     */
    public static BigDecimal subtract(Double x, Double y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Double - Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal subtract(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer - Integer = BigDecimal
     */
    public static BigDecimal subtract(Integer x, Integer y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Integer - Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal subtract(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * String - String = BigDecimal
     */
    public static BigDecimal subtract(String x, String y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(new BigDecimal(x), new BigDecimal(y));
    }

    /**
     * String - String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal subtract(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(new BigDecimal(x), new BigDecimal(y), places);
    }

    /**
     * BigDecimal - Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal subtract(BigDecimal x, Double y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(x, BigDecimal.valueOf(y));
    }

    /**
     * Double - BigDecimal = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal subtract(Double x, BigDecimal y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y);
    }

    /**
     * BigDecimal - Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal subtract(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(x, BigDecimal.valueOf(y), places);
    }

    /**
     * Double - BigDecimal = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal subtract(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y, places);
    }

    /**
     * BigDecimal - String = BigDecimal
     */
    public static BigDecimal subtract(BigDecimal x, String y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(x, new BigDecimal(y));
    }

    /**
     * String - BigDecimal = BigDecimal
     */
    public static BigDecimal subtract(String x, BigDecimal y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(new BigDecimal(x), y);
    }

    /**
     * BigDecimal - String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal subtract(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(x, new BigDecimal(y), places);
    }

    /**
     * String - BigDecimal = BigDecimal
     */
    public static BigDecimal subtract(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(new BigDecimal(x), y, places);
    }

    /**
     * Double - String = BigDecimal
     */
    public static BigDecimal subtract(Double x, String y) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y));
    }

    /**
     * String - Double = BigDecimal
     */
    public static BigDecimal subtract(String x,  Double y) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y));
    }

    /**
     * Double - String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal subtract(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y), places);
    }

    /**
     * Double - String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal subtract(String x, Double y, int places) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer - BigDecimal = BigDecimal
     */
    public static BigDecimal subtract(Integer x, BigDecimal y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y);
    }

    /**
     * BigDecimal - Integer = BigDecimal
     */
    public static BigDecimal subtract(BigDecimal x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return subtract(x, BigDecimal.valueOf(y));
    }

    /**
     * Integer - BigDecimal = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal subtract(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y, places);
    }

    /**
     * BigDecimal - Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal subtract(BigDecimal x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return subtract(x, BigDecimal.valueOf(y), places);
    }

    /**
     * Integer - Double = BigDecimal
     */
    public static BigDecimal subtract(Integer x, Double y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Double - Integer = BigDecimal
     */
    public static BigDecimal subtract(Double x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Integer - Double = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal subtract(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Double - Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal subtract(Double x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer - String = BigDecimal
     */
    public static BigDecimal subtract(Integer x, String y) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y));
    }

    /**
     * String - Integer = BigDecimal
     */
    public static BigDecimal subtract(String x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y));
    }

    /**
     * Integer - String = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal subtract(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y), places);
    }

    /**
     * String - Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal subtract(String x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y), places);
    }

    //*********************************************减法返回BigDecimal类型，结束*********************************************


    //*********************************************减法返回Double类型，开始*********************************************

    /**
     * BigDecimal - BigDecimal = Double
     */
    public static Double subtractToDouble(BigDecimal x, BigDecimal y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return x.subtract(y).doubleValue();
    }

    /**
     * BigDecimal - BigDecimal = Double
     * @param places 保留小数点后的位数
     */
    public static Double subtractToDouble(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.subtract(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * Double - Double = Double
     */
    public static Double subtractToDouble(Double x, Double y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double - Double = Double
     * 可指定小数点后位数
     */
    public static Double subtractToDouble(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer - Integer = Double
     */
    public static Double subtractToDouble(Integer x, Integer y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer - Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double subtractToDouble(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * String - String = Double
     */
    public static Double subtractToDouble(String x, String y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(new BigDecimal(x), new BigDecimal(y)).doubleValue();
    }

    /**
     * String - String = Double
     * 可指定小数点后位数
     */
    public static Double subtractToDouble(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(new BigDecimal(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * BigDecimal - Double = Double
     */
    public static Double subtractToDouble(BigDecimal x, Double y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(x, BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double - BigDecimal = Double
     */
    public static Double subtractToDouble(Double x, BigDecimal y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y).doubleValue();
    }

    /**
     * BigDecimal - Double = Double
     * 可指定小数点后位数
     */
    public static Double subtractToDouble(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(x, BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Double - BigDecimal = Double
     * 可指定小数点后位数
     */
    public static Double subtractToDouble(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y, places).doubleValue();
    }

    /**
     * BigDecimal - String = Double
     */
    public static Double subtractToDouble(BigDecimal x, String y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(x, new BigDecimal(y)).doubleValue();
    }

    /**
     * String - BigDecimal = Double
     */
    public static Double subtractToDouble(String x, BigDecimal y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(new BigDecimal(x), y).doubleValue();
    }

    /**
     * BigDecimal - String = Double
     * 可指定小数点后位数
     */
    public static Double subtractToDouble(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(x, new BigDecimal(y), places).doubleValue();
    }

    /**
     * String - BigDecimal = Double
     * 可指定小数点后位数
     */
    public static Double subtractToDouble(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(new BigDecimal(x), y, places).doubleValue();
    }

    /**
     * Double - String = Double
     */
    public static Double subtractToDouble(Double x, String y) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y)).doubleValue();
    }

    /**
     * String - Double = Double
     */
    public static Double subtractToDouble(String x,  Double y) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double - String = Double
     * 可指定小数点后位数
     */
    public static Double subtractToDouble(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * Double - String = Double
     * 可指定小数点后位数
     */
    public static Double subtractToDouble(String x, Double y, int places) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer - BigDecimal = Double
     */
    public static Double subtractToDouble(Integer x, BigDecimal y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y).doubleValue();
    }

    /**
     * BigDecimal - Integer = Double
     */
    public static Double subtractToDouble(BigDecimal x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return subtract(x, BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer - BigDecimal = Double
     * @param places 保留小数点后的位数
     */
    public static Double subtractToDouble(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y, places).doubleValue();
    }

    /**
     * BigDecimal - Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double subtractToDouble(BigDecimal x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return subtract(x, BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer - Double = Double
     */
    public static Double subtractToDouble(Integer x, Double y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double - Integer = Double
     */
    public static Double subtractToDouble(Double x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer - Double = Double
     * @param places 保留小数点后的位数
     */
    public static Double subtractToDouble(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Double - Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double subtractToDouble(Double x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer - String = Double
     */
    public static Double subtractToDouble(Integer x, String y) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y)).doubleValue();
    }

    /**
     * String - Integer = Double
     */
    public static Double subtractToDouble(String x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer - String = Double
     * @param places 保留小数点后的位数
     */
    public static Double subtractToDouble(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * String - Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double subtractToDouble(String x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    //*********************************************减法返回Double类型，结束*********************************************


    //*********************************************减法返回String类型，开始*********************************************

    /**
     * BigDecimal - BigDecimal = String
     */
    public static String subtractToString(BigDecimal x, BigDecimal y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return x.subtract(y).toString();
    }

    /**
     * BigDecimal - BigDecimal = String
     * @param places 保留小数点后的位数
     */
    public static String subtractToString(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.subtract(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * Double - Double = String
     */
    public static String subtractToString(Double x, Double y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double - Double = String
     * 可指定小数点后位数
     */
    public static String subtractToString(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer - Integer = String
     */
    public static String subtractToString(Integer x, Integer y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer - Integer = String
     * @param places 保留小数点后的位数
     */
    public static String subtractToString(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * String - String = String
     */
    public static String subtractToString(String x, String y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(new BigDecimal(x), new BigDecimal(y)).toString();
    }

    /**
     * String - String = String
     * 可指定小数点后位数
     */
    public static String subtractToString(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(new BigDecimal(x), new BigDecimal(y), places).toString();
    }

    /**
     * BigDecimal - Double = String
     */
    public static String subtractToString(BigDecimal x, Double y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(x, BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double - BigDecimal = String
     */
    public static String subtractToString(Double x, BigDecimal y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y).toString();
    }

    /**
     * BigDecimal - Double = String
     * 可指定小数点后位数
     */
    public static String subtractToString(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(x, BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Double - BigDecimal = String
     * 可指定小数点后位数
     */
    public static String subtractToString(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y, places).toString();
    }

    /**
     * BigDecimal - String = String
     */
    public static String subtractToString(BigDecimal x, String y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(x, new BigDecimal(y)).toString();
    }

    /**
     * String - BigDecimal = String
     */
    public static String subtractToString(String x, BigDecimal y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(new BigDecimal(x), y).toString();
    }

    /**
     * BigDecimal - String = String
     * 可指定小数点后位数
     */
    public static String subtractToString(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(x, new BigDecimal(y), places).toString();
    }

    /**
     * String - BigDecimal = String
     * 可指定小数点后位数
     */
    public static String subtractToString(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(new BigDecimal(x), y, places).toString();
    }

    /**
     * Double - String = String
     */
    public static String subtractToString(Double x, String y) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y)).toString();
    }

    /**
     * String - Double = String
     */
    public static String subtractToString(String x,  Double y) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double - String = String
     * 可指定小数点后位数
     */
    public static String subtractToString(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y), places).toString();
    }

    /**
     * Double - String = String
     * 可指定小数点后位数
     */
    public static String subtractToString(String x, Double y, int places) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer - BigDecimal = String
     */
    public static String subtractToString(Integer x, BigDecimal y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y).toString();
    }

    /**
     * BigDecimal - Integer = String
     */
    public static String subtractToString(BigDecimal x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return subtract(x, BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer - BigDecimal = String
     * @param places 保留小数点后的位数
     */
    public static String subtractToString(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return subtract(BigDecimal.valueOf(x), y, places).toString();
    }

    /**
     * BigDecimal - Integer = String
     * @param places 保留小数点后的位数
     */
    public static String subtractToString(BigDecimal x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return subtract(x, BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer - Double = String
     */
    public static String subtractToString(Integer x, Double y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double - Integer = String
     */
    public static String subtractToString(Double x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer - Double = String
     * @param places 保留小数点后的位数
     */
    public static String subtractToString(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Double - Integer = String
     * @param places 保留小数点后的位数
     */
    public static String subtractToString(Double x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return subtract(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer - String = String
     */
    public static String subtractToString(Integer x, String y) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y)).toString();
    }

    /**
     * String - Integer = String
     */
    public static String subtractToString(String x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer - String = String
     * @param places 保留小数点后的位数
     */
    public static String subtractToString(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return subtract(BigDecimal.valueOf(x), new BigDecimal(y), places).toString();
    }

    /**
     * String - Integer = String
     * @param places 保留小数点后的位数
     */
    public static String subtractToString(String x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return subtract(new BigDecimal(x), BigDecimal.valueOf(y), places).toString();
    }

    //*********************************************减法返回String类型，结束*********************************************

    //*********************************************乘法返回BigDecimal类型，开始*********************************************

    /**
     * BigDecimal * BigDecimal = BigDecimal
     */
    public static BigDecimal multiply(BigDecimal x, BigDecimal y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return x.multiply(y);
    }

    /**
     * BigDecimal * BigDecimal = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal multiply(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.multiply(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Double * Double = BigDecimal
     */
    public static BigDecimal multiply(Double x, Double y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Double * Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal multiply(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer * Integer = BigDecimal
     */
    public static BigDecimal multiply(Integer x, Integer y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Integer * Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal multiply(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * String * String = BigDecimal
     */
    public static BigDecimal multiply(String x, String y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(new BigDecimal(x), new BigDecimal(y));
    }

    /**
     * String * String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal multiply(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(new BigDecimal(x), new BigDecimal(y), places);
    }

    /**
     * BigDecimal × Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal multiply(BigDecimal x, Double y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(x, BigDecimal.valueOf(y));
    }

    /**
     * Double × BigDecimal = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal multiply(Double x, BigDecimal y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y);
    }

    /**
     * BigDecimal × Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal multiply(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(x, BigDecimal.valueOf(y), places);
    }

    /**
     * Double × BigDecimal = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal multiply(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y, places);
    }

    /**
     * BigDecimal × String = BigDecimal
     */
    public static BigDecimal multiply(BigDecimal x, String y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(x, new BigDecimal(y));
    }

    /**
     * String × BigDecimal = BigDecimal
     */
    public static BigDecimal multiply(String x, BigDecimal y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(new BigDecimal(x), y);
    }

    /**
     * BigDecimal × String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal multiply(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(x, new BigDecimal(y), places);
    }

    /**
     * String × BigDecimal = BigDecimal
     */
    public static BigDecimal multiply(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(new BigDecimal(x), y, places);
    }

    /**
     * Double × String = BigDecimal
     */
    public static BigDecimal multiply(Double x, String y) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y));
    }

    /**
     * String × Double = BigDecimal
     */
    public static BigDecimal multiply(String x,  Double y) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y));
    }

    /**
     * Double × String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal multiply(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y), places);
    }

    /**
     * Double × String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal multiply(String x, Double y, int places) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer × BigDecimal = BigDecimal
     */
    public static BigDecimal multiply(Integer x, BigDecimal y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y);
    }

    /**
     * BigDecimal × Integer = BigDecimal
     */
    public static BigDecimal multiply(BigDecimal x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return multiply(x, BigDecimal.valueOf(y));
    }

    /**
     * Integer × BigDecimal = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal multiply(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y, places);
    }

    /**
     * BigDecimal × Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal multiply(BigDecimal x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return multiply(x, BigDecimal.valueOf(y), places);
    }

    /**
     * Integer × Double = BigDecimal
     */
    public static BigDecimal multiply(Integer x, Double y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Double × Integer = BigDecimal
     */
    public static BigDecimal multiply(Double x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
    }

    /**
     * Integer × Double = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal multiply(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Double × Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal multiply(Double x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer × String = BigDecimal
     */
    public static BigDecimal multiply(Integer x, String y) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y));
    }

    /**
     * String × Integer = BigDecimal
     */
    public static BigDecimal multiply(String x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y));
    }

    /**
     * Integer × String = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal multiply(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y), places);
    }

    /**
     * String × Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal multiply(String x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y), places);
    }

    //*********************************************乘法返回BigDecimal类型，结束*********************************************


    //*********************************************乘法返回Double类型，开始*********************************************

    /**
     * BigDecimal * BigDecimal = Double
     */
    public static Double multiplyToDouble(BigDecimal x, BigDecimal y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return x.multiply(y).doubleValue();
    }

    /**
     * BigDecimal * BigDecimal = Double
     * @param places 保留小数点后的位数
     */
    public static Double multiplyToDouble(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.multiply(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * Double * Double = Double
     */
    public static Double multiplyToDouble(Double x, Double y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double * Double = Double
     * 可指定小数点后位数
     */
    public static Double multiplyToDouble(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer * Integer = Double
     */
    public static Double multiplyToDouble(Integer x, Integer y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer * Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double multiplyToDouble(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * String * String = Double
     */
    public static Double multiplyToDouble(String x, String y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(new BigDecimal(x), new BigDecimal(y)).doubleValue();
    }

    /**
     * String * String = Double
     * 可指定小数点后位数
     */
    public static Double multiplyToDouble(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(new BigDecimal(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * BigDecimal × Double = Double
     * 可指定小数点后位数
     */
    public static Double multiplyToDouble(BigDecimal x, Double y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(x, BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double × BigDecimal = Double
     * 可指定小数点后位数
     */
    public static Double multiplyToDouble(Double x, BigDecimal y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y).doubleValue();
    }

    /**
     * BigDecimal × Double = Double
     * 可指定小数点后位数
     */
    public static Double multiplyToDouble(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(x, BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Double × BigDecimal = Double
     * 可指定小数点后位数
     */
    public static Double multiplyToDouble(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y, places).doubleValue();
    }

    /**
     * BigDecimal × String = Double
     */
    public static Double multiplyToDouble(BigDecimal x, String y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(x, new BigDecimal(y)).doubleValue();
    }

    /**
     * String × BigDecimal = Double
     */
    public static Double multiplyToDouble(String x, BigDecimal y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(new BigDecimal(x), y).doubleValue();
    }

    /**
     * BigDecimal × String = Double
     * 可指定小数点后位数
     */
    public static Double multiplyToDouble(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(x, new BigDecimal(y), places).doubleValue();
    }

    /**
     * String × BigDecimal = Double
     */
    public static Double multiplyToDouble(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(new BigDecimal(x), y, places).doubleValue();
    }

    /**
     * Double × String = Double
     */
    public static Double multiplyToDouble(Double x, String y) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y)).doubleValue();
    }

    /**
     * String × Double = Double
     */
    public static Double multiplyToDouble(String x,  Double y) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double × String = Double
     * 可指定小数点后位数
     */
    public static Double multiplyToDouble(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * Double × String = Double
     * 可指定小数点后位数
     */
    public static Double multiplyToDouble(String x, Double y, int places) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer × BigDecimal = Double
     */
    public static Double multiplyToDouble(Integer x, BigDecimal y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y).doubleValue();
    }

    /**
     * BigDecimal × Integer = Double
     */
    public static Double multiplyToDouble(BigDecimal x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return multiply(x, BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer × BigDecimal = Double
     * @param places 保留小数点后的位数
     */
    public static Double multiplyToDouble(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y, places).doubleValue();
    }

    /**
     * BigDecimal × Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double multiplyToDouble(BigDecimal x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return multiply(x, BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer × Double = Double
     */
    public static Double multiplyToDouble(Integer x, Double y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Double × Integer = Double
     */
    public static Double multiplyToDouble(Double x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer × Double = Double
     * @param places 保留小数点后的位数
     */
    public static Double multiplyToDouble(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Double × Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double multiplyToDouble(Double x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer × String = Double
     */
    public static Double multiplyToDouble(Integer x, String y) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y)).doubleValue();
    }

    /**
     * String × Integer = Double
     */
    public static Double multiplyToDouble(String x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y)).doubleValue();
    }

    /**
     * Integer × String = Double
     * @param places 保留小数点后的位数
     */
    public static Double multiplyToDouble(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * String × Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double multiplyToDouble(String x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    //*********************************************乘法返回Double类型，结束*********************************************


    //*********************************************乘法返回String类型，开始*********************************************

    /**
     * BigDecimal * BigDecimal = String
     */
    public static String multiplyToString(BigDecimal x, BigDecimal y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return x.multiply(y).toString();
    }

    /**
     * BigDecimal * BigDecimal = String
     * @param places 保留小数点后的位数
     */
    public static String multiplyToString(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.multiply(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * Double * Double = String
     */
    public static String multiplyToString(Double x, Double y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double * Double = String
     * 可指定小数点后位数
     */
    public static String multiplyToString(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer * Integer = String
     */
    public static String multiplyToString(Integer x, Integer y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer * Integer = String
     * @param places 保留小数点后的位数
     */
    public static String multiplyToString(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * String * String = String
     */
    public static String multiplyToString(String x, String y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(new BigDecimal(x), new BigDecimal(y)).toString();
    }

    /**
     * String * String = String
     * 可指定小数点后位数
     */
    public static String multiplyToString(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(new BigDecimal(x), new BigDecimal(y), places).toString();
    }

    /**
     * BigDecimal × Double = String
     * 可指定小数点后位数
     */
    public static String multiplyToString(BigDecimal x, Double y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(x, BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double × BigDecimal = String
     * 可指定小数点后位数
     */
    public static String multiplyToString(Double x, BigDecimal y) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y).toString();
    }

    /**
     * BigDecimal × Double = String
     * 可指定小数点后位数
     */
    public static String multiplyToString(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(x, BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Double × BigDecimal = String
     * 可指定小数点后位数
     */
    public static String multiplyToString(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y, places).toString();
    }

    /**
     * BigDecimal × String = String
     */
    public static String multiplyToString(BigDecimal x, String y) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(x, new BigDecimal(y)).toString();
    }

    /**
     * String × BigDecimal = String
     */
    public static String multiplyToString(String x, BigDecimal y) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(new BigDecimal(x), y).toString();
    }

    /**
     * BigDecimal × String = String
     * 可指定小数点后位数
     */
    public static String multiplyToString(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(x, new BigDecimal(y), places).toString();
    }

    /**
     * String × BigDecimal = String
     */
    public static String multiplyToString(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(new BigDecimal(x), y, places).toString();
    }

    /**
     * Double × String = String
     */
    public static String multiplyToString(Double x, String y) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y)).toString();
    }

    /**
     * String × Double = String
     */
    public static String multiplyToString(String x,  Double y) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double × String = String
     * 可指定小数点后位数
     */
    public static String multiplyToString(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y), places).toString();
    }

    /**
     * Double × String = String
     * 可指定小数点后位数
     */
    public static String multiplyToString(String x, Double y, int places) {
        if (y == null) {
            y = 0.0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer × BigDecimal = String
     */
    public static String multiplyToString(Integer x, BigDecimal y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y).toString();
    }

    /**
     * BigDecimal × Integer = String
     */
    public static String multiplyToString(BigDecimal x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return multiply(x, BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer × BigDecimal = String
     * @param places 保留小数点后的位数
     */
    public static String multiplyToString(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return multiply(BigDecimal.valueOf(x), y, places).toString();
    }

    /**
     * BigDecimal × Integer = String
     * @param places 保留小数点后的位数
     */
    public static String multiplyToString(BigDecimal x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return multiply(x, BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer × Double = String
     */
    public static String multiplyToString(Integer x, Double y) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Double × Integer = String
     */
    public static String multiplyToString(Double x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer × Double = String
     * @param places 保留小数点后的位数
     */
    public static String multiplyToString(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Double × Integer = String
     * @param places 保留小数点后的位数
     */
    public static String multiplyToString(Double x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = 0.0;
        }
        return multiply(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer × String = String
     */
    public static String multiplyToString(Integer x, String y) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y)).toString();
    }

    /**
     * String × Integer = String
     */
    public static String multiplyToString(String x, Integer y) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y)).toString();
    }

    /**
     * Integer × String = String
     * @param places 保留小数点后的位数
     */
    public static String multiplyToString(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return multiply(BigDecimal.valueOf(x), new BigDecimal(y), places).toString();
    }

    /**
     * String × Integer = String
     * @param places 保留小数点后的位数
     */
    public static String multiplyToString(String x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        return multiply(new BigDecimal(x), BigDecimal.valueOf(y), places).toString();
    }

    //*********************************************乘法返回String类型，结束*********************************************


    //*********************************************除法返回BigDecimal类型，开始*********************************************

    /**
     * BigDecimal ÷ BigDecimal = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal divide(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null || y.compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return x.divide(y, places, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Double ÷ Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal divide(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null || BigDecimal.valueOf(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer ÷ Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal divide(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null || BigDecimal.valueOf(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * String ÷ String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal divide(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null || new BigDecimal(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(new BigDecimal(x), new BigDecimal(y), places);
    }

    /**
     * BigDecimal ÷ Double = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal divide(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null || BigDecimal.valueOf(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(x, BigDecimal.valueOf(y), places);
    }

    /**
     * Double ÷ BigDecimal = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal divide(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null || y.compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), y, places);
    }

    /**
     * BigDecimal ÷ String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal divide(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null || new BigDecimal(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(x, new BigDecimal(y), places);
    }

    /**
     * String ÷ BigDecimal = BigDecimal
     */
    public static BigDecimal divide(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null || y.compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(new BigDecimal(x), y, places);
    }

    /**
     * Double ÷ String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal divide(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null || new BigDecimal(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), new BigDecimal(y), places);
    }

    /**
     * Double ÷ String = BigDecimal
     * 可指定小数点后位数
     */
    public static BigDecimal divide(String x, Double y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null || BigDecimal.valueOf(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(new BigDecimal(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer ÷ BigDecimal = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal divide(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null || y.compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), y, places);
    }

    /**
     * BigDecimal ÷ Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal divide(BigDecimal x, Integer y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null || BigDecimal.valueOf(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(x, BigDecimal.valueOf(y), places);
    }

    /**
     * Integer ÷ Double = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal divide(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null || BigDecimal.valueOf(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Double ÷ Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal divide(Double x, Integer y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null || BigDecimal.valueOf(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places);
    }

    /**
     * Integer ÷ String = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal divide(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null || new BigDecimal(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), new BigDecimal(y), places);
    }

    /**
     * String ÷ Integer = BigDecimal
     * @param places 保留小数点后的位数
     */
    public static BigDecimal divide(String x, Integer y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        if (y == null || BigDecimal.valueOf(y).compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        return divide(new BigDecimal(x), BigDecimal.valueOf(y), places);
    }

    //*********************************************除法返回BigDecimal类型，结束*********************************************


    //*********************************************除法返回Double类型，开始*********************************************

    /**
     * BigDecimal ÷ BigDecimal = Double
     * @param places 保留小数点后的位数
     */
    public static Double divideToDouble(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.divide(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * Double ÷ Double = Double
     * 可指定小数点后位数
     */
    public static Double divideToDouble(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer ÷ Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double divideToDouble(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * String ÷ String = Double
     * 可指定小数点后位数
     */
    public static Double divideToDouble(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return divide(new BigDecimal(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * BigDecimal ÷ Double = Double
     * 可指定小数点后位数
     */
    public static Double divideToDouble(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return divide(x, BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Double ÷ BigDecimal = Double
     * 可指定小数点后位数
     */
    public static Double divideToDouble(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), y, places).doubleValue();
    }

    /**
     * BigDecimal ÷ String = Double
     * 可指定小数点后位数
     */
    public static Double divideToDouble(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return divide(x, new BigDecimal(y), places).doubleValue();
    }

    /**
     * String ÷ BigDecimal = Double
     * 可指定小数点后位数
     */
    public static Double divideToDouble(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return divide(new BigDecimal(x), y, places).doubleValue();
    }

    /**
     * Double ÷ String = Double
     * 可指定小数点后位数
     */
    public static Double divideToDouble(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return divide(BigDecimal.valueOf(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * Double ÷ String = Double
     * 可指定小数点后位数
     */
    public static Double divideToDouble(String x, Double y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = 0.0;
        }
        return divide(new BigDecimal(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer ÷ BigDecimal = Double
     * @param places 保留小数点后的位数
     */
    public static Double divideToDouble(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), y, places).doubleValue();
    }

    /**
     * BigDecimal ÷ Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double divideToDouble(BigDecimal x, Integer y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0;
        }
        return divide(x, BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer ÷ Double = Double
     * @param places 保留小数点后的位数
     */
    public static Double divideToDouble(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Double ÷ Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double divideToDouble(Double x, Integer y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0;
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    /**
     * Integer ÷ String = Double
     * @param places 保留小数点后的位数
     */
    public static Double divideToDouble(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0.0";
        }
        return divide(BigDecimal.valueOf(x), new BigDecimal(y), places).doubleValue();
    }

    /**
     * String ÷ Integer = Double
     * @param places 保留小数点后的位数
     */
    public static Double divideToDouble(String x, Integer y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        if (y == null) {
            y = 0;
        }
        return divide(new BigDecimal(x), BigDecimal.valueOf(y), places).doubleValue();
    }

    //*********************************************除法返回Double类型，结束*********************************************


    //*********************************************除法返回String类型，开始*********************************************

    /**
     * BigDecimal ÷ BigDecimal = String
     * @param places 保留小数点后的位数
     */
    public static String divideToString(BigDecimal x, BigDecimal y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        BigDecimal res = x.divide(y);
        return res.setScale(places, BigDecimal.ROUND_HALF_UP).toString();
    }

    /**
     * Double ÷ Double = String
     * 可指定小数点后位数
     */
    public static String divideToString(Double x, Double y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0.0;
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer ÷ Integer = String
     * @param places 保留小数点后的位数
     */
    public static String divideToString(Integer x, Integer y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0;
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * String ÷ String = String
     * 可指定小数点后位数
     */
    public static String divideToString(String x, String y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return divide(new BigDecimal(x), new BigDecimal(y), places).toString();
    }

    /**
     * BigDecimal ÷ Double = String
     * 可指定小数点后位数
     */
    public static String divideToString(BigDecimal x, Double y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (y == null) {
            y = 0.0;
        }
        return divide(x, BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Double ÷ BigDecimal = String
     * 可指定小数点后位数
     */
    public static String divideToString(Double x, BigDecimal y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), y, places).toString();
    }

    /**
     * BigDecimal ÷ String = String
     * 可指定小数点后位数
     */
    public static String divideToString(BigDecimal x, String y, int places) {
        if (x == null) {
            x = new BigDecimal("0");
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return divide(x, new BigDecimal(y), places).toString();
    }

    /**
     * String ÷ BigDecimal = String
     * 可指定小数点后位数
     */
    public static String divideToString(String x, BigDecimal y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return divide(new BigDecimal(x), y, places).toString();
    }

    /**
     * Double ÷ String = String
     * 可指定小数点后位数
     */
    public static String divideToString(Double x, String y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return divide(BigDecimal.valueOf(x), new BigDecimal(y), places).toString();
    }

    /**
     * Double ÷ String = String
     * 可指定小数点后位数
     */
    public static String divideToString(String x, Double y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0";
        }
        if (y == null) {
            y = 0.0;
        }
        return divide(new BigDecimal(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer ÷ BigDecimal = String
     * @param places 保留小数点后的位数
     */
    public static String divideToString(Integer x, BigDecimal y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = new BigDecimal("0");
        }
        return divide(BigDecimal.valueOf(x), y, places).toString();
    }

    /**
     * BigDecimal ÷ Integer = String
     * @param places 保留小数点后的位数
     */
    public static String divideToString(BigDecimal x, Integer y, int places) {
        if (y == null) {
            y = 0;
        }
        if (x == null) {
            x = new BigDecimal("0");
        }
        return divide(x, BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer ÷ Double = String
     * @param places 保留小数点后的位数
     */
    public static String divideToString(Integer x, Double y, int places) {
        if (x == null) {
            x = 0;
        }
        if (y == null) {
            y = 0.0;
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Double ÷ Integer = String
     * @param places 保留小数点后的位数
     */
    public static String divideToString(Double x, Integer y, int places) {
        if (x == null) {
            x = 0.0;
        }
        if (y == null) {
            y = 0;
        }
        return divide(BigDecimal.valueOf(x), BigDecimal.valueOf(y), places).toString();
    }

    /**
     * Integer ÷ String = String
     * @param places 保留小数点后的位数
     */
    public static String divideToString(Integer x, String y, int places) {
        if (x == null) {
            x = 0;
        }
        if (StringUtils.isBlank(y)) {
            y = "0";
        }
        return divide(BigDecimal.valueOf(x), new BigDecimal(y), places).toString();
    }

    /**
     * String ÷ Integer = String
     * @param places 保留小数点后的位数
     */
    public static String divideToString(String x, Integer y, int places) {
        if (StringUtils.isBlank(x)) {
            x = "0.0";
        }
        if (y == null) {
            y = 0;
        }
        return divide(new BigDecimal(x), BigDecimal.valueOf(y), places).toString();
    }

    //*********************************************除法返回String类型，结束*********************************************

}
