import Engine.*;
import Engine.Object;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class Cony {
    private Window window =
            new Window
                    (800,800,"Hello World");
    private ArrayList<Object> objectsCony
            = new ArrayList<>();


    private MouseInput mouseInput;
    float counterDegreeKaki = 45f;
    float counterDegreeKepalaX = 25f;
    float counterDegreeKepalaY = 45f;
    int gantiArah = 1;
    float ybadan =0f;
    public void init() {
        window.init();
        GL.createCapabilities();
        mouseInput = window.getMouseInput();
        //code
        //kepala
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(0).scaleObject(0.4f, 0.35f, 0.3f);
        //badan
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(1).translateObject(0f, -0.6f, 0f);
        objectsCony.get(1).scaleObject(0.32f, 0.45f, 0.32f);
        //tangan kanan
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(2).translateObject(-0.3f, -0.8f, 0f);
        objectsCony.get(2).scaleObject(0.12f, 0.36f, 0.15f);
        objectsCony.get(2).rotateObject(0.5f, 0.0f, 0f, -1f);
        //tangan kiri
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(3).translateObject(0.3f, -0.8f, 0f);
        objectsCony.get(3).scaleObject(0.12f, 0.36f, 0.15f);
        objectsCony.get(3).rotateObject(0.5f, 0.0f, 0f, 1f);
        //kaki kanan
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(4).translateObject(-0.5f, -1f, 0f);
        objectsCony.get(4).scaleObject(0.15f, 0.44f, 0.15f);

        //telapak kaki kanan
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                // atur warna
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        //geser kiri- kanan+, bawah- atas+, idk
        objectsCony.get(5).translateObject(0.6f,-5.5f,-0.1f);
        //melebar, meninggi, muncul garis2
        objectsCony.get(5).scaleObject(0.15f,0.11f,0.15f);
        //kaki kiri
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(6).translateObject(0.5f, -1f, 0f);
        objectsCony.get(6).scaleObject(0.15f, 0.44f, 0.15f);
        //telapak kaki kiri
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                // atur warna
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        //geser kiri- kanan+, bawah- atas+, idk
        objectsCony.get(7).translateObject(-0.6f,-5.5f,-0.1f);
        //melebar, meninggi, muncul garis2
        objectsCony.get(7).scaleObject(0.15f,0.11f,0.15f);
//        //telinga kiri
//        objectsCony.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsCony.get(8).translateObject(1f, 0.4f, 0f);
//        objectsCony.get(8).scaleObject(0.08f, 0.44f, 0.05f);
//        objectsCony.add(new Circle(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.976f, 0.565f, 0.635f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.5f,
//                0.5f
//        ));
//        objectsCony.get(9).translateObject(1.28f, 0.6f, -2.499f);
//        objectsCony.get(9).scaleObject(0.06f, 0.3f, 0.01f);
        //telinga kanan
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(8).translateObject(-1f, 0.4f, 0f);
        objectsCony.get(8).scaleObject(0.08f, 0.44f, 0.05f);
        objectsCony.add(new Circle(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.976f, 0.565f, 0.635f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f
        ));
        objectsCony.get(9).translateObject(-1.28f, 0.6f, -2.499f);
        objectsCony.get(9).scaleObject(0.06f, 0.3f, 0.01f);
        //mata
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(10).translateObject(-1f, 1.2f, -3.2f);
        objectsCony.get(10).scaleObject(0.04f, 0.04f, 0.04f);
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(11).translateObject(1f, 1.2f, -3.2f);
        objectsCony.get(11).scaleObject(0.04f, 0.04f, 0.04f);
        //hidung
        objectsCony.add(new Circle(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f
        ));
        objectsCony.get(12).translateObject(0f, 0f, -15f);
        objectsCony.get(12).scaleObject(0.05f, 0.04f, 0.01f);
        objectsCony.add(new EllipticParaboloid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(13).translateObject(0f, 0f, -20f);
        objectsCony.get(13).scaleObject(0.02f, 0.013f, 0.0083f);
        //blushes
        objectsCony.add(new Circle(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.941f, 0.80f, 0.816f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f
        ));
        objectsCony.get(14).translateObject(1.72f, 0f, -14f);
        objectsCony.get(14).scaleObject(0.05f, 0.025f, 0.01f);
        objectsCony.add(new Circle(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.941f, 0.80f, 0.816f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f
        ));
        objectsCony.get(15).translateObject(-1.72f, 0f, -14f);
        objectsCony.get(15).scaleObject(0.05f, 0.025f, 0.01f);
        //bowtie
        objectsCony.add(new Cone(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,0.0f,0.0f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(16).scaleObject(0.005f,0.02f,0.05f);
        objectsCony.get(16).translateObject(0.15f,-0.19f,0.02f);
        objectsCony.get(16).rotateObject((float)Math.toRadians(95),0f,1f,0f);
        objectsCony.add(new Cone(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,0.0f,0.0f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(17).scaleObject(0.005f,0.02f,0.05f);
        objectsCony.get(17).translateObject(-0.15f,-0.19f,0.02f);
        objectsCony.get(17).rotateObject((float)Math.toRadians(95),0f,-1f,0f);
        //hat
        objectsCony.add(new Cylinder(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,0.0f,0.0f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(18).scaleObject(0.15f,0.15f,0.25f);
        objectsCony.get(18).translateObject(0.01f,0.0f,-0.15f);
        objectsCony.get(18).rotateObject((float)Math.toRadians(90),1f,0f,-0.5f);
        objectsCony.add(new Cylinder(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,0.0f,0.0f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(19).scaleObject(0.2f,0.2f,0.0f);
        objectsCony.get(19).translateObject(0.01f,0.0f,-0.15f);
        objectsCony.get(19).rotateObject((float)Math.toRadians(90),1f,0f,-0.5f);
        //mulut
        objectsCony.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,0.0f,0.0f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(20).scaleObject(0.014f,0.075f,0.0f);
        objectsCony.get(20).translateObject(0f,-0.033f,-0.149f);
        objectsCony.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,0.0f,0.0f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(21).scaleObject(0.05f,0.014f,0.0f);
        objectsCony.get(21).translateObject(0.015f,-0.049f,-0.145f);
        objectsCony.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,0.0f,0.0f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(22).scaleObject(0.05f,0.014f,0.0f);
        objectsCony.get(22).translateObject(-0.015f,-0.049f,-0.145f);
        objectsCony.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,0.0f,0.0f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(23).scaleObject(0.07f,0.014f,0.0f);
        objectsCony.get(23).translateObject(0.01f,-0.064f,-0.14f);
        objectsCony.get(23).rotateObject((float)Math.toRadians(34f),0.1f,0f,1f);
        objectsCony.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,0.0f,0.0f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(24).scaleObject(0.07f,0.014f,0.0f);
        objectsCony.get(24).translateObject(-0.01f,-0.064f,-0.14f);
        objectsCony.get(24).rotateObject((float)Math.toRadians(34f),0.1f,0f,-1f);

//        objectsConyPointsControl.add(new Object(
//                Arrays.asList(
//                        //ShaderFile lokasi menyesuaikan object
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER)
//                        , new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.0f,0.0f,1.0f)
//        ));
//        objectsConyPointsControl.get(0).addVertices(new Vector3f(0.1f,0.1f,1f));
//        objectsConyPointsControl.get(0).addVertices(new Vector3f(0.2f,-0.4f,1f));
//        objectsConyPointsControl.get(0).addVertices(new Vector3f(0.3f,0.1f,1f));
//        objectLengkung.add(new Object(
//                Arrays.asList(
//                        //ShaderFile lokasi menyesuaikan object
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER)
//                        , new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),lengkung(0f),
//                new Vector4f(0.0f,0.0f,0.0f,1.0f)
//        ));
//        objectLengkung.get(0).translateObject(0f,1f,-1f);
//        objectLengkung.get(0).scaleObject(0.3f,0.4f,0.0f);
    }
    public void input(){
        if (window.isKeyPressed(GLFW_KEY_X)){
            for(Object object: objectsCony){
                object.rotateObject((float) Math.toRadians(0.5f),1.0f,0.0f,0.0f);
            }
//            for(Object object: objectLengkung){
//                object.rotateObject((float) Math.toRadians(0.5f),1.0f,0.0f,0.0f);
//            }
        }
        if (window.isKeyPressed(GLFW_KEY_Y)){
            setYbadan(0.5f);
            for(Object object: objectsCony){
                object.rotateObject((float) Math.toRadians(0.5f),0.0f,1.0f,0.0f);
            }
//            for(Object object: objectLengkung){
//                object.rotateObject((float) Math.toRadians(0.5f),0.0f,1.0f,0.0f);
//            }
        }
        if (window.isKeyPressed(GLFW_KEY_Z)){
            for(Object object: objectsCony){
                object.rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,1.0f);
            }
//            for(Object object: objectLengkung){
//                object.rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,1.0f);
//            }
        }
        if (window.isKeyPressed(GLFW_KEY_W)){
            float degree = 1f;
            System.out.println("count degree kaki: " + counterDegreeKaki);
            if (counterDegreeKaki >= 90f){
                gantiArah *= -1;
                counterDegreeKaki = 0;
                System.out.println("ganti arah");
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
            }
            //kaki kanan
            List<Float> temppc = new ArrayList<>(objectsCony.get(4).getCenterPoint());
            objectsCony.get(4).translateObject(temppc.get(0)*-1, temppc.get(1)*-1, temppc.get(2)*-1);
            objectsCony.get(4).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(4).translateObject(temppc.get(0)*1, temppc.get(1)*1, temppc.get(2)*1);
            //kaki kiri
            List<Float> temp1C = new ArrayList<>(objectsCony.get(6).getCenterPoint());
            objectsCony.get(6).translateObject(temp1C.get(0)*-1,temp1C.get(1)*-1,temp1C.get(2)*-1);
            objectsCony.get(6).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 1f, 0f,0f);
            objectsCony.get(6).translateObject(temp1C.get(0)*1,temp1C.get(1)*1,temp1C.get(2)*1);
            //telapak kaki kanan
            objectsCony.get(5).translateObject(temppc.get(0)*-1, temppc.get(1)*-1, temppc.get(2)*-1);
            objectsCony.get(5).rotateObject((float)Math.toRadians(gantiArah*-degree), 1f, 0f,0f);
            objectsCony.get(5).translateObject(temppc.get(0)*1, temppc.get(1)*1, temppc.get(2)*1);
            //telapak kaki kiri
            objectsCony.get(7).translateObject(temp1C.get(0)*-1,temp1C.get(1)*-1,temp1C.get(2)*-1);
            objectsCony.get(7).rotateObject((float)Math.toRadians(gantiArah*(degree)), 1f, 0f,0f);
            objectsCony.get(7).translateObject(temp1C.get(0)*1,temp1C.get(1)*1,temp1C.get(2)*1);
            //tangan kanan
            List<Float> temp2C = new ArrayList<>(objectsCony.get(2).getCenterPoint());
            objectsCony.get(2).translateObject(temp2C.get(0)*-1,temp2C.get(1)*-1,temp2C.get(2)*-1);
            objectsCony.get(2).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 1f, 0f,0f);
            objectsCony.get(2).translateObject(temp2C.get(0)*1,temp2C.get(1)*1,temp2C.get(2)*1);
            //tangan kiri
            List<Float> temp3C = new ArrayList<>(objectsCony.get(3).getCenterPoint());
            objectsCony.get(3).translateObject(temp3C.get(0)*-1,temp3C.get(1)*-1,temp3C.get(2)*-1);
            objectsCony.get(3).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(3).translateObject(temp3C.get(0)*1,temp3C.get(1)*1,temp3C.get(2)*1);
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
            }
            counterDegreeKaki+=degree;
        }
        //ngangguk
        if (window.isKeyPressed(GLFW_KEY_A)){
            float degree = 1f;
            System.out.println("count degree kaki: " + counterDegreeKepalaX);
            if (counterDegreeKepalaX >= 50f){
                gantiArah *= -1;
                counterDegreeKepalaX = 0;
                System.out.println("ganti arah");
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
            }
            List<Float> tempC = new ArrayList<>(objectsCony.get(0).getCenterPoint());
            //kepala
            objectsCony.get(0).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(0).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(0).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            //telinga
            objectsCony.get(8).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(8).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(8).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            objectsCony.get(9).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(9).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(9).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            //mata
            objectsCony.get(10).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(10).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(10).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            objectsCony.get(11).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(11).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(11).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            //hidung
            objectsCony.get(12).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(12).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(12).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            objectsCony.get(13).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(13).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(13).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            //blushes
            objectsCony.get(14).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(14).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(14).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            objectsCony.get(15).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(15).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(15).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            //hat
            objectsCony.get(18).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(18).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(18).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            objectsCony.get(19).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(19).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(19).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            //mulut
            objectsCony.get(20).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(20).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(20).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            objectsCony.get(21).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(21).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(21).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            objectsCony.get(22).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(22).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(22).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            objectsCony.get(23).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(23).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(23).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            objectsCony.get(24).translateObject(tempC.get(0)*-1,tempC.get(1)*-1,tempC.get(2)*-1);
            objectsCony.get(24).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
            objectsCony.get(24).translateObject(tempC.get(0)*1,tempC.get(1)*1,tempC.get(2)*1);
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
            }
            counterDegreeKepalaX+=degree;
        }
        //geleng
        if (window.isKeyPressed(GLFW_KEY_D)){
            float degree = 1f;
            System.out.println("count degree kaki: " + counterDegreeKepalaX);
            if (counterDegreeKepalaY >= 90f){
                gantiArah *= -1;
                counterDegreeKepalaY = 0;
                System.out.println("ganti arah");
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
            }
            List<Float> tempppC = new ArrayList<>(objectsCony.get(0).getCenterPoint());
            //kepala
            objectsCony.get(0).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(0).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(0).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            //telinga
            objectsCony.get(8).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(8).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(8).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            objectsCony.get(9).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(9).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(9).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            //mata
            objectsCony.get(10).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(10).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(10).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            objectsCony.get(11).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(11).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(11).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            //hidung
            objectsCony.get(12).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(12).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(12).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            objectsCony.get(13).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(13).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(13).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            //blushes
            objectsCony.get(14).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(14).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(14).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            objectsCony.get(15).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(15).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(15).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            //hat
            objectsCony.get(18).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(18).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(18).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            objectsCony.get(19).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(19).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(19).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            //mulut
            objectsCony.get(20).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(20).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(20).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            objectsCony.get(21).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(21).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(21).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            objectsCony.get(22).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(22).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(22).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            objectsCony.get(23).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(23).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(23).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            objectsCony.get(24).translateObject(tempppC.get(0)*-1, tempppC.get(1)*-1, tempppC.get(2)*-1);
            objectsCony.get(24).rotateObject((float)Math.toRadians(gantiArah*degree), 0f, 1f,0f);
            objectsCony.get(24).translateObject(tempppC.get(0)*1, tempppC.get(1)*1, tempppC.get(2)*1);
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
            }
            counterDegreeKepalaY+=degree;
        }
    }
    public void loop(){
        while (window.isOpen()) {
            window.update();
            glClearColor(0.678f, 0.847f, 0.902f,
                    0.0f);
            GL.createCapabilities();
            input();

            //code
            for(Object object: objectsCony){
                object.draw();
            }


            // Restore state
            glDisableVertexAttribArray(0);

            // Poll for window events.
            // The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
        }
    }
    public void run() {

        init();
        loop();

        // Terminate GLFW and
        // free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }
    public static void main(String[] args) {
        new Main().run();
    }
    public int factorial(int fact) {
        if (fact <= 1)
            return 1;
        else {
            return fact * factorial(fact-1);
        }
    }

    public int combination(int n, int r) {
        return factorial(n) / (factorial(r)*factorial(n-r));
    }

//    public List<Vector3f> lengkung(float z) {
//        ArrayList<Integer> pascal = new ArrayList<>();
//        List<Vector3f> vertices = new ArrayList<>();
//
//        for (int i = 0; i<objectsConyPointsControl.get(0).getVerticesSize();i++) {
//            pascal.add(combination(objectsConyPointsControl.get(0).getVerticesSize()-1,i));
//        }
//
//
//        for (double t = 0; t<= 1; t+=0.01) {
//            float x = 0;
//            float y = 0;
//            for (int i = 0; i < objectsConyPointsControl.get(0).getVerticesSize(); i++) {
//                x += pascal.get(i) * (objectsConyPointsControl.get(0).getVerticesX(i) * Math.pow(1-t, (objectsConyPointsControl.get(0).getVerticesSize()-1)-i) * Math.pow(t, i));
//                y += pascal.get(i) * (objectsConyPointsControl.get(0).getVerticesY(i) * Math.pow(1-t, (objectsConyPointsControl.get(0).getVerticesSize()-1)-i) * Math.pow(t, i));
//            }
//            vertices.add(new Vector3f(x,y,z));
//        }

//        return vertices;


//    }
    public void setYbadan(float ybadann) {
        this.ybadan += ybadann;
    }
}
