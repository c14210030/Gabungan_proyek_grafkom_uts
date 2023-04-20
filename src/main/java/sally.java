//import Engine.*;
//import Engine.Object;
//import org.joml.Vector2f;
//import org.joml.Vector4f;
//import org.lwjgl.opengl.GL;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.lwjgl.glfw.GLFW.*;
//import static org.lwjgl.opengl.GL11.glClearColor;
//import static org.lwjgl.opengl.GL30.*;
//
//public class sally {
//    private Window window =
//            new Window
//                    (800,800,"Proyek Sally Line");
//    private ArrayList<Object> objectsSally
//            = new ArrayList<>();
//
//
//    private MouseInput mouseInput;
//    float CounterDegreeKakiSally = 30f;
//    float CounterDegreeKepalaSally = 30f;
//    int gantiArah = 1;
//    float ybadan = 0f;
//    public void init(){
//        window.init();
//        GL.createCapabilities();
//        mouseInput = window.getMouseInput();
//        //code
//        //kepala
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.8f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(0).scaleObject(0.4f,0.4f,0.4f);
//
//        //badan
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.8f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(1).translateObject(0f,-0.6f,0f);
//        objectsSally.get(1).scaleObject(0.4f,0.42f,0.38f);
//
//        //tangan kanan
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.8f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(2).translateObject(-0.25f,-0.9f,0f);
//        objectsSally.get(2).scaleObject(0.15f,0.38f,0.1f);
//        objectsSally.get(2).rotateObject(0.5f,0.0f,0f,-1f);
//
//        //tangan kiri
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.8f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(3).translateObject(0.25f,-0.9f,0f);
//        objectsSally.get(3).scaleObject(0.15f,0.38f,0.1f);
//        objectsSally.get(3).rotateObject(0.5f,0.0f,0f,1f);
//
//        //kaki kanan
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.4f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(4).translateObject(-0.45f,-0.9f,0f);
//        objectsSally.get(4).scaleObject(0.12f,0.42f,0.15f);
//
//        //kaki kiri
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.4f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(5).translateObject(0.45f,-0.9f,0f);
//        objectsSally.get(5).scaleObject(0.12f,0.42f,0.15f);
//
//        //mata kiri
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f,0.0f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(6).translateObject(-0.7f,0.6f,-0.6f);
//        objectsSally.get(6).scaleObject(0.06f,0.06f,0.2f);
//
//        //mata kanan
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f,0.0f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(7).translateObject(0.7f,0.6f,-0.6f);
//        objectsSally.get(7).scaleObject(0.06f,0.06f,0.2f);
//
//        //mulut atas
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.4f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(8).translateObject(0.f,-0.55f,-0.6f);
//        objectsSally.get(8).scaleObject(0.14f,0.06f,0.2f);
//
//        //mulut bwh
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,0.4f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(9).translateObject(0.f,-0.78f,-0.6f);
//        objectsSally.get(9).scaleObject(0.14f,0.066f,0.2f);
//
//        //telapak kaki kiri
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                // atur warna
//                new Vector4f(1.0f,0.4f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(10).translateObject(-0.55f,-5.f,-0.1f);
//        objectsSally.get(10).scaleObject(0.10f,0.11f,0.15f);
//
//        //telapak kaki kiri
//        objectsSally.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                // atur warna
//                new Vector4f(1.0f,0.4f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(11).translateObject(0.55f,-5.f,-0.1f);
//        objectsSally.get(11).scaleObject(0.10f,0.11f,0.15f);
//
//        //surat
//        objectsSally.add(new Sphere(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1f,1f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(12).translateObject(0.25f,-1.96f,0f);
//        objectsSally.get(12).scaleObject(0.45f,0.3f,0.03f);
//        objectsSally.get(12).rotateObject(0.45f,0.0f,0f,1f);
//
//        //dasi
//        objectsSally.add(new EllipticCone(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("C:\\Users\\krisc\\OneDrive\\Dokumen\\Grafkom\\2\\grafkom\\grafkom\\resources\\shader\\scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0f,0f,0.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsSally.get(13).translateObject(10f,0f,-7.9f);
//        objectsSally.get(13).scaleObject(0.015f,0.03f,0.02f);
//        objectsSally.get(13).rotateObject(1.6f,0f,0f,-1f);
//    }
//
//    public void input(){
//        //kepala kiri
//        if (window.isKeyPressed(GLFW_KEY_W)) {
//            countDegree++;
//            //rotasi terhadap matahari
//            //kepala
//            objectsSally.get(0).rotateObject((float) Math.toRadians(0.3f),0.0f,1.0f,0.0f);
//            for(Object child:objectsSally.get(0).getChildObject()){
//                List<Float> temp = new ArrayList<>(child.getCenterPoint());
//                //rotasi terhadap sumbu masing-masing planet
//                child.translateObject(temp.get(0)*-1,temp.get(1)*-1,temp.get(2)*-1);
//                child.rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,1.0f);
//                child.translateObject(temp.get(0)*1,temp.get(1)*1,temp.get(2)*1);
//                for(Object y:objectsSally.get(0).getChildObject().get(1).getChildObject()){
//                    //rotasi terhadap bumi
//                    List<Float> temp1S = new ArrayList<>(objectsSally.get(0).getChildObject().get(1).getCenterPoint());
//                    y.translateObject(temp1S.get(0)*-1,temp1S.get(1)*-1,temp1S.get(2)*-1);
//                    y.rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,1.0f);
//                    y.translateObject(temp1S.get(0)*1,temp1S.get(1)*1,temp1S.get(2)*1);
//                    //rotasi terhadap sumbunya sendiri
//                    temp1S = new ArrayList<>(objectsSally.get(0).getChildObject().get(1).getChildObject().get(0).getCenterPoint());
//                    y.translateObject(temp1S.get(0)*-1,temp1S.get(1)*-1,temp1S.get(2)*-1);
//                    y.rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,1.0f);
//                    y.translateObject(temp1S.get(0)*1,temp1S.get(1)*1,temp1S.get(2)*1);
//                }
//                child.rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,1.0f);
//            }
//            //mata kiri
//            objectsSally.get(6).rotateObject((float) Math.toRadians(0.3f),0.0f,1.0f,0.0f);
//            //mata kanan
//            objectsSally.get(7).rotateObject((float) Math.toRadians(0.3f),0.0f,1.0f,0.0f);
//            //mlt ats
//            objectsSally.get(8).rotateObject((float) Math.toRadians(0.3f),0.0f,1.0f,0.0f);
//            //mlt bwh
//            objectsSally.get(9).rotateObject((float) Math.toRadians(0.3f),0.0f,1.0f,0.0f);
//        }
//        //kepala kanan
//        if (window.isKeyPressed(GLFW_KEY_E)) {
//            countDegree++;
//            //kepala
//            objectsSally.get(0).rotateObject((float) Math.toRadians(-0.3f),0.0f,1.0f,0.0f);
//            //mata kiri
//            objectsSally.get(6).rotateObject((float) Math.toRadians(-0.3f),0.0f,1.0f,0.0f);
//            //mata kanan
//            objectsSally.get(7).rotateObject((float) Math.toRadians(-0.3f),0.0f,1.0f,0.0f);
//            //mlt ats
//            objectsSally.get(8).rotateObject((float) Math.toRadians(-0.3f),0.0f,1.0f,0.0f);
//            //mlt bwh
//            objectsSally.get(9).rotateObject((float) Math.toRadians(-0.3f),0.0f,1.0f,0.0f);
//        }
//
//        if(mouseInput.isLeftButtonPressed()){
//            Vector2f pos = mouseInput.getCurrentPos();
////            System.out.println("x : "+pos.x+" y : "+pos.y);
//            pos.x = (pos.x - (window.getWidth())/2.0f) /
//                    (window.getWidth()/2.0f);
//            pos.y = (pos.y - (window.getHeight())/2.0f) /
//                    (-window.getHeight()/2.0f);
//            //System.out.println("x : "+pos.x+" y : "+pos.y);
//
//            if((!(pos.x > 1 || pos.x < -0.97) && !(pos.y > 0.97 || pos.y < -1))){
//                System.out.println("x : "+pos.x+" y : "+pos.y);
////                objectsSallyPointsControl.get(0).addVertices(new Vector3f(pos.x,pos.y,0));
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_X)){
//            for(Object object: objectsSally){
//                object.rotateObject((float) Math.toRadians(0.5f),1.0f,0.0f,0.0f);
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_Y)){
//            setYbadan(-0.5f);
//            for(Object object: objectsSally){
//                object.rotateObject((float) Math.toRadians(0.5f),0.0f,1.0f,0.0f);
//            }
//        }
//        if (window.isKeyPressed(GLFW_KEY_Z)){
//            for(Object object: objectsSally){
//                object.rotateObject((float) Math.toRadians(0.5f),0.0f,0.0f,1.0f);
//            }
//        }
//
//        //kaki
//        if (window.isKeyPressed(GLFW_KEY_R)) {
//            //kaki kanan
//            objectsSally.get(4).rotateObject((float)Math.toRadians(-0.15f), 1f, 0f,0f);
//            //kaki kiri
//            objectsSally.get(5).rotateObject((float)Math.toRadians(0.15f), 1f, 0f,0f);
//            //telapak kaki kanan
//            objectsSally.get(10).rotateObject((float)Math.toRadians(-0.15f), 1f, 0f,0f);
//            //telapak kaki kiri
//            objectsSally.get(11).rotateObject((float)Math.toRadians(0.15f), 1f, 0f,0f);
//        }
//        //kaki balik
//        if (window.isKeyPressed(GLFW_KEY_T)) {
//            //kaki kanan
//            objectsSally.get(4).rotateObject((float)Math.toRadians(0.15f), 1f, 0f,0f);
//            //kaki kiri
//            objectsSally.get(5).rotateObject((float)Math.toRadians(-0.15f), 1f, 0f,0f);
//            //telapak kaki kanan
//            objectsSally.get(10).rotateObject((float)Math.toRadians(0.15f), 1f, 0f,0f);
//            //telapak kaki kiri
//            objectsSally.get(11).rotateObject((float)Math.toRadians(-0.15f), 1f, 0f,0f);
//        }
//
//        //tangan atas
//        if (window.isKeyPressed(GLFW_KEY_F)){
//            countDegree++;
//            //tgn kri
//            objectsSally.get(2).rotateObject((float) Math.toRadians(0.2f),0.0f,0.0f,-1.0f);
//            //tgn kanan
//            objectsSally.get(3).rotateObject((float) Math.toRadians(0.2f),0.0f,0.0f,1.0f);
//            //surat
//            objectsSally.get(12).rotateObject((float) Math.toRadians(0.2f),0.0f,0.0f,1.0f);
//        }
//        //tangan bawah
//        if (window.isKeyPressed(GLFW_KEY_G)){
//            countDegree++;
//            //tgn kri
//            objectsSally.get(2).rotateObject((float) Math.toRadians(-0.2f),0.0f,0.0f,-1.0f);
//            //tgn kanan
//            objectsSally.get(3).rotateObject((float) Math.toRadians(-0.2f),0.0f,0.0f,1.0f);
//            //surat
//            objectsSally.get(12).rotateObject((float) Math.toRadians(-0.2f),0.0f,0.0f,1.0f);
//        }
//        if (window.isKeyPressed(GLFW_KEY_K)){
//            countDegree++;
//            //tgn kanan
//            objectsSally.get(3).rotateObject((float) Math.toRadians(0.2f),0.0f,0.0f,1.0f);
//            //surat
//            objectsSally.get(12).rotateObject((float) Math.toRadians(0.2f),0.0f,0.0f,1.0f);
//        }
//
//        if (window.isKeyPressed(GLFW_KEY_L)){
//            countDegree++;
//            //tgn kanan
//            objectsSally.get(3).rotateObject((float) Math.toRadians(-0.2f),0.0f,0.0f,1.0f);
//            //surat
//            objectsSally.get(12).rotateObject((float) Math.toRadians(-0.2f),0.0f,0.0f,1.0f);
//        }
//        //terbang atas
//        if (window.isKeyPressed(GLFW_KEY_U)){
//            for(Object object: objectsSally){
//                object.translateObject(0f,0.001f,0f);
//            }
//        }
//        //terbang bawah
//        if (window.isKeyPressed(GLFW_KEY_I)){
//            for(Object object: objectsSally){
//                object.translateObject(0f,-0.001f,0f);
//            }
//        }
//        //jln dpn
//        if (window.isKeyPressed(GLFW_KEY_N)) {
//            //kaki kanan
//            objectsSally.get(4).rotateObject((float)Math.toRadians(0.15f), 1f, 0f,0f);
//            //kaki kiri
//            objectsSally.get(5).rotateObject((float)Math.toRadians(-0.15f), 1f, 0f,0f);
//            //telapak kaki kanan
//            objectsSally.get(10).rotateObject((float)Math.toRadians(0.15f), 1f, 0f,0f);
//            //telapak kaki kiri
//            objectsSally.get(11).rotateObject((float)Math.toRadians(-0.15f), 1f, 0f,0f);
//            //tgn kri
//            objectsSally.get(2).rotateObject((float) Math.toRadians(-0.15f),0.0f,0.0f,-1.0f);
//            //tgn kanan
//            objectsSally.get(3).rotateObject((float) Math.toRadians(0.15f),0.0f,0.0f,1.0f);
//            //surat
//            objectsSally.get(12).rotateObject((float) Math.toRadians(0.15f),0.0f,0.0f,1.0f);
//        }
//        //jln blkg
//        if (window.isKeyPressed(GLFW_KEY_M)) {
//            //kaki kanan
//            objectsSally.get(4).rotateObject((float)Math.toRadians(-0.15f), 1f, 0f,0f);
//            //kaki kiri
//            objectsSally.get(5).rotateObject((float)Math.toRadians(0.15f), 1f, 0f,0f);
//            //telapak kaki kanan
//            objectsSally.get(10).rotateObject((float)Math.toRadians(-0.15f), 1f, 0f,0f);
//            //telapak kaki kiri
//            objectsSally.get(11).rotateObject((float)Math.toRadians(0.15f), 1f, 0f,0f);
//            //tgn kri
//            objectsSally.get(2).rotateObject((float) Math.toRadians(0.15f),0.0f,0.0f,-1.0f);
//            //tgn kanan
//            objectsSally.get(3).rotateObject((float) Math.toRadians(-0.15f),0.0f,0.0f,1.0f);
//            //surat
//            objectsSally.get(12).rotateObject((float) Math.toRadians(-0.15f),0.0f,0.0f,1.0f);
//        }
//
//        //jalan
//        if (window.isKeyPressed(GLFW_KEY_P)){
//            float degree = 0.5f;
//            System.out.println("count degree kaki: " + CounterDegreeKakiSally);
//            if (CounterDegreeKakiSally >= 70f){
//                gantiArah *= -1;
//                CounterDegreeKakiSally = 0;
//                System.out.println("ganti arah");
//            }
//            for (Object object : objectsSally) {
//                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
//            }
//
//            //kaki kanan
//            List<Float> temp0S = new ArrayList<>(objectsSally.get(2).getCenterPoint());
//            objectsSally.get(4).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(4).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 1f, 0f,0f);
//            objectsSally.get(4).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //kaki kiri
//            List<Float> temp1S = new ArrayList<>(objectsSally.get(3).getCenterPoint());
//            objectsSally.get(5).translateObject(temp1S.get(0)*-1,temp1S.get(1)*-1,temp1S.get(2)*-1);
//            objectsSally.get(5).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
//            objectsSally.get(5).translateObject(temp1S.get(0)*1,temp1S.get(1)*1,temp1S.get(2)*1);
//            //telapak kaki kanan
//            objectsSally.get(10).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(10).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 1f, 0f,0f);
//            objectsSally.get(10).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //telapak kaki kiri
//            objectsSally.get(11).translateObject(temp1S.get(0)*-1,temp1S.get(1)*-1,temp1S.get(2)*-1);
//            objectsSally.get(11).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
//            objectsSally.get(11).translateObject(temp1S.get(0)*1,temp1S.get(1)*1,temp1S.get(2)*1);
//
//            //tangan kanan
//            List<Float> temp2S = new ArrayList<>(objectsSally.get(2).getCenterPoint());
//            objectsSally.get(2).translateObject(temp2S.get(0)*-1,temp2S.get(1)*-1,temp2S.get(2)*-1);
//            objectsSally.get(2).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 1f, 0f,0f);
//            objectsSally.get(2).translateObject(temp2S.get(0)*1,temp2S.get(1)*1,temp2S.get(2)*1);
//            //tangan kiri
//            List<Float> temp3S = new ArrayList<>(objectsSally.get(3).getCenterPoint());
//            objectsSally.get(3).translateObject(temp3S.get(0)*-1,temp3S.get(1)*-1,temp3S.get(2)*-1);
//            objectsSally.get(3).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
//            objectsSally.get(3).translateObject(temp3S.get(0)*1,temp3S.get(1)*1,temp3S.get(2)*1);
//            //surat
//            objectsSally.get(12).translateObject(temp2S.get(0)*-1,temp2S.get(1)*-1,temp2S.get(2)*-1);
//            objectsSally.get(12).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 1f, 0f,0f);
//            objectsSally.get(12).translateObject(temp2S.get(0)*1,temp2S.get(1)*1,temp2S.get(2)*1);
//
//            for (Object object : objectsSally) {
//                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
//            }
//            CounterDegreeKakiSally+=degree;
//        }
//        //kepala
//        if (window.isKeyPressed(GLFW_KEY_O)){
//            float degree = 0.3f;
//            System.out.println("count degree kaki: " + CounterDegreeKakiSally);
//            if (CounterDegreeKakiSally >= 70f){
//                gantiArah *= -1;
//                CounterDegreeKakiSally = 0;
//                System.out.println("ganti arah");
//            }
//            for (Object object : objectsSally) {
//                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
//            }
//
//            //kaki kanan
//            List<Float> temp0S = new ArrayList<>(objectsSally.get(0).getCenterPoint());
//            objectsSally.get(0).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(0).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objectsSally.get(0).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //kaki kiri
//            objectsSally.get(6).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(6).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objectsSally.get(6).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //telapak kaki kanan
//            objectsSally.get(7).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(7).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objectsSally.get(7).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //telapak kaki kiri
//            objectsSally.get(8).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(8).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objectsSally.get(8).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //tangan kanan
//            objectsSally.get(9).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(9).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objectsSally.get(9).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//
//            for (Object object : objectsSally) {
//                object.rotateObject((float) Math.toRadians(ybadan), 0f, 0f, 1f);
//            }
//            CounterDegreeKakiSally+=degree;
//        }
//    }
//    public void loop(){
//        while (window.isOpen()) {
//            window.update();
//            glClearColor(0.8f,
//                    0.55f, 0.0f,
//                    0.0f);
//            GL.createCapabilities();
//            input();
//
//            //code
//            for(Object object: objectsSally){
//                object.draw();
//            }
//            for(Object object: objectsSallyRectangle){
//                object.draw();
//            }
//            for(Object object: objectsSallyPointsControl){
//                object.drawLine();
//            }
//
//            // Restore state
//            glDisableVertexAttribArray(0);
//
//            // Poll for window events.
//            // The key callback above will only be
//            // invoked during this call.
//            glfwPollEvents();
//        }
//    }
//    public void run() {
//
//        init();
//        loop();
//
//        // Terminate GLFW and
//        // free the error callback
//        glfwTerminate();
//        glfwSetErrorCallback(null).free();
//    }
//    public static void main(String[] args) {
//        new Proyek().run();
//    }
//    public void setYbadan(float ybadan){
//        this.ybadan += ybadan;
//    }
//}